package ir.freeland.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ir.freeland.springboot.model.entity.Account;
import ir.freeland.springboot.model.entity.Person;





@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findByAccountNumber(String accountNumber);
	
	Person findByShabaNumber(String shabaNumber);
	
	void deleteById(long id);
  

}
