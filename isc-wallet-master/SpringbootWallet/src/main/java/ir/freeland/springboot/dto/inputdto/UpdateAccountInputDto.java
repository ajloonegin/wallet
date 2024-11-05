package ir.freeland.springboot.dto.inputdto;

import java.time.LocalDate;
import java.util.Date;

import ir.freeland.springboot.annotation.CardNumber;
import ir.freeland.springboot.annotation.IbanCode;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UpdateAccountInputDto {


	private long id;

	// account number= card number

	private String accountNumber;

	// rial

	private long accountBalance;


	private Date dateOfCreate;
	
	// Iban number= shaba number

	private String shabaNumber;

	public UpdateAccountInputDto() {
		super();

	}

	public UpdateAccountInputDto(long id, String accountNumber, long accountBalance, Date dateOfCreate,
			String shabaNumber) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.dateOfCreate = dateOfCreate;
		this.shabaNumber = shabaNumber;
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

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
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

}