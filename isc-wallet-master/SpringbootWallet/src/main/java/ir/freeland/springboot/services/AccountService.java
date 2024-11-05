package ir.freeland.springboot.services;

import java.util.Date;
import java.util.List;

import ir.freeland.springboot.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ir.freeland.springboot.dto.inputdto.AddAccountInputDto;
import ir.freeland.springboot.dto.inputdto.AddPersonInputDto;
import ir.freeland.springboot.dto.inputdto.DeleteAccountInputDto;
import ir.freeland.springboot.dto.inputdto.DeletePersonInputDto;
import ir.freeland.springboot.dto.inputdto.DepositInputDto;
import ir.freeland.springboot.dto.inputdto.TransactionInputDto;
import ir.freeland.springboot.dto.inputdto.TransferInputDto;
import ir.freeland.springboot.dto.inputdto.UpdateAccountInputDto;
import ir.freeland.springboot.dto.inputdto.UpdatePersonInputDto;
import ir.freeland.springboot.dto.inputdto.WithdrawInputDto;

import ir.freeland.springboot.model.constant.Operation;
import ir.freeland.springboot.model.entity.Account;
import ir.freeland.springboot.model.entity.Transaction;
import ir.freeland.springboot.repo.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionService transactionService;

	public List<Account> getAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	public Account createAccount(AddAccountInputDto addAccountInputDto) {
		Account account = new Account();
		account.setAccountNumber(addAccountInputDto.getAccountNumber());
		account.setAccountBalance(addAccountInputDto.getAccountBalance());
		account.setDateOfCreate(addAccountInputDto.getDateOfCreate());
		account.setShabaNumber(addAccountInputDto.getShabaNumber());

		return accountRepository.save(account);
	}

	public Account findAccountByAccountNumber(String accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}

	public Account getAccountById(Long id) {
		return accountRepository.findById(id).orElse(null);
	}

	public Account updateAccount(Long id, UpdateAccountInputDto updateAccountInputDto) {
		Account account = getAccountById(id);
		if (account != null) {

			account.setId(updateAccountInputDto.getId());
			account.setAccountNumber(updateAccountInputDto.getAccountNumber());
			account.setAccountBalance(updateAccountInputDto.getAccountBalance());
			account.setDateOfCreate(updateAccountInputDto.getDateOfCreate());
			account.setShabaNumber(updateAccountInputDto.getShabaNumber());

			return accountRepository.save(account);
		}
		return null;
	}

	public Account deleteAccount(DeleteAccountInputDto deleteAccountInputDto) {
		Account account = getAccountById(deleteAccountInputDto.getId());
		if (account != null) {
			accountRepository.deleteById(deleteAccountInputDto.getId());
		}
		return null;
	}

	public void deposit(DepositInputDto depositInputDto) {
		Account account = findAccountByAccountNumber(depositInputDto.getDestinationAccountNumber());

		if (account != null) {
			transactionService.updateAccountBalance(account, depositInputDto.getAmount(), Operation.DEPOSIT);


		}

	}

	public void withdraw(WithdrawInputDto withdrawInputDto) {
		Account account = findAccountByAccountNumber(withdrawInputDto.getAccountNumber());
		if (account != null) {
			transactionService.updateAccountBalance(account, withdrawInputDto.getAmount(), Operation.WITHDRAW);
		}

	}

	public void transfer(TransferInputDto transferInputDto) {
		Account sourceAccount = findAccountByAccountNumber(transferInputDto.getSourceAccountNumber());
		Account destinationAccount = findAccountByAccountNumber(transferInputDto.getDestinationAccountNumber());
		if (sourceAccount != null && destinationAccount != null) {
			transactionService.makeTransfer(sourceAccount, destinationAccount, transferInputDto.getAmount());
		}

	}

	public List<Transaction> showTransaction(TransactionInputDto transactionInputDto) {

		return transactionService.showTransaction(transactionInputDto.getAccountNumber());
	}

}
