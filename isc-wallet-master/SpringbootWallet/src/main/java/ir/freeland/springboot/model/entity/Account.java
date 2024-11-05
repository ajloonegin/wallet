package ir.freeland.springboot.model.entity;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Service;

import ir.freeland.springboot.annotation.CardNumber;
import ir.freeland.springboot.annotation.IbanCode;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;

@Entity
@Table(name="ISC_ACCOUNT")
@Service
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_id")
	private long id;
	
	//account number= card number
	@CardNumber
	@Column(nullable = false, unique = true)
	private String accountNumber;
	
	//rial
	@Column(nullable = false, unique = false)
	@Min(10000)
	private double accountBalance;
	
	@Column(nullable = false)
	private Date dateOfCreate;
	
	//Iban number= shaba number
//	@IbanCode
	@Column(nullable = false, unique = true)
	private String shabaNumber;
	
	
	

	public Account() {
		super();
	
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}







	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public Date getDateOfCreate() {
		return dateOfCreate;
	}



	public void setDateOfCreate(Date dateOfCreate) {
		this.dateOfCreate = dateOfCreate;
	}



	public String getShabaNumber() {
		return shabaNumber;
	}



	public void setShabaNumber(String shabaNumber) {
		this.shabaNumber = shabaNumber;
	}

	
	




	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", dateOfCreate=" + dateOfCreate + ", shabaNumber=" + shabaNumber + "]";
	}



	
	
	
	
	
	
	
	

}
