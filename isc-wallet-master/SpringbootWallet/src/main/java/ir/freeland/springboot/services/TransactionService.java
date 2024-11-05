package ir.freeland.springboot.services;


import java.util.Collections;
import java.util.Date;
import java.util.List;

import ir.freeland.springboot.dto.inputdto.DepositInputDto;
import ir.freeland.springboot.dto.inputdto.TransferInputDto;
import ir.freeland.springboot.dto.inputdto.WithdrawInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ir.freeland.springboot.model.constant.Operation;
import ir.freeland.springboot.model.entity.Account;
import ir.freeland.springboot.model.entity.Transaction;
import ir.freeland.springboot.repo.AccountRepository;
import ir.freeland.springboot.repo.TransactionRepository;


@Service
public class TransactionService {
	
	private static final double MIN_WITHDRAWAL_AMOUNT = 100000; // 100,000 Rials
    private static final double MAX_WITHDRAWAL_AMOUNT = 10_000_000; // 10 million Rials

	@Autowired
    private AccountRepository accountRepository;
	
	@Autowired
    private TransactionRepository transactionRepository;







    public Transaction createTransaction(WithdrawInputDto withdrawInputDto, Operation operation) {
        Date date = new Date();
        Transaction transaction=new Transaction();
        transaction.setSourceAccountNumber(withdrawInputDto.getAccountNumber());
        transaction.setDestinationAccountNumber(withdrawInputDto.getAccountNumber());
        transaction.setOperation(operation);
        transaction.setAmount(withdrawInputDto.getAmount());
        transaction.setDate(date);

        return transactionRepository.save(transaction);
    }

    public Transaction createTransaction(DepositInputDto depositInputDto, Operation operation) {
        Date date = new Date();
        Transaction transaction=new Transaction();
        transaction.setSourceAccountNumber(depositInputDto.getDestinationAccountNumber());
        transaction.setDestinationAccountNumber(depositInputDto.getDestinationAccountNumber());
        transaction.setOperation(operation);
        transaction.setAmount(depositInputDto.getAmount());
        transaction.setDate(date);

        return transactionRepository.save(transaction);
    }

    public Transaction createTransaction(TransferInputDto transferInputDto, Operation operation) {
        Date date = new Date();
        Transaction transaction=new Transaction();
        transaction.setSourceAccountNumber(transferInputDto.getSourceAccountNumber());
        transaction.setDestinationAccountNumber(transferInputDto.getDestinationAccountNumber());
        transaction.setOperation(operation);
        transaction.setAmount(transferInputDto.getAmount());
        transaction.setDate(date);

        return transactionRepository.save(transaction);
    }

	public void updateAccountBalance(Account account, double amount, Operation op) {
		Date date = new Date();
        if (op == Operation.WITHDRAW &&  iswithdrawPossible(amount, date, account.getAccountNumber(), op)) {
        	
            account.setAccountBalance((account.getAccountBalance() - amount));
        } else if (op == Operation.DEPOSIT) {
            account.setAccountBalance((account.getAccountBalance() + amount));
        }
        accountRepository.save(account);
    }
	
	public void makeTransfer(Account sourceAccount,Account destinationAccount, double amount) {
       
		sourceAccount.setAccountBalance((sourceAccount.getAccountBalance() - amount));
		destinationAccount.setAccountBalance((destinationAccount.getAccountBalance() + amount));
        
        accountRepository.save(sourceAccount);
        accountRepository.save(destinationAccount);
    }
	
	public List<Transaction> showTransaction(String accountNumber) {
	       
		return transactionRepository.findBySourceAccountNumber(accountNumber);
        
    }
	
	
	public boolean iswithdrawPossible(double amount, Date date, String accountNumber, Operation operation) {
		if (amount < MIN_WITHDRAWAL_AMOUNT || amount > MAX_WITHDRAWAL_AMOUNT) {
            return false;
        }else {
	     List<Transaction> todaysTransaction = transactionRepository.findBySourceAccountNumberAndDateAndOperation(accountNumber, date, operation);
	     double totalWithdrawn = todaysTransaction.stream().mapToDouble(Transaction::getAmount).sum();

	        if (totalWithdrawn + amount > MAX_WITHDRAWAL_AMOUNT) {
	            return false;
	        }
	        return true;
        }
    }
	public boolean isAmountAvailable(double amount, double accountBalance) {
        return (accountBalance - amount) > 0;
    }
	

}
