package ir.freeland.springboot.repo;


import java.time.LocalDate;

import java.util.Date;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ir.freeland.springboot.model.constant.Operation;
import ir.freeland.springboot.model.entity.Transaction;



@Repository
public interface TransactionRepository  extends CrudRepository <Transaction, Long>{
	List<Transaction> findBySourceAccountNumber(String sourceAccountNumber);

	List<Transaction> findByDestinationAccountNumber(String destinationAccountNumber);
	List<Transaction> findBySourceAccountNumberAndDateAndOperation(String sourceAccountNumber, Date date, Operation operation);

	List<Transaction> findByDestinationAccountNumberAndDateAndOperation(String destinationAccountNumber, Date date, Operation operation);
	
}
