package ir.freeland.springboot.model.entity;

import java.util.Date;
import java.util.Objects;

import org.springframework.stereotype.Service;

import ir.freeland.springboot.annotation.CardNumber;
import ir.freeland.springboot.model.constant.Operation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ISC_TRANSACTION")
@Service
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id")
	private Long id;

	// account number=card number
	@CardNumber
	@Column(nullable = false, unique = false)
	private String sourceAccountNumber;

	@CardNumber
	@Column(nullable = false, unique = false)
	private String destinationAccountNumber;


	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Operation operation;


	@Column(nullable = false, unique = false)
	private double amount;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;

	public Transaction() {
		super();

	}

	public Transaction(String sourceAccountNumber, String destinationAccountNumber, Operation operation, double amount, Date date) {
		this.sourceAccountNumber = sourceAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
		this.operation = operation;
		this.amount = amount;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(String destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Transaction that = (Transaction) o;
		return Double.compare(amount, that.amount) == 0 && Objects.equals(id, that.id) && Objects.equals(sourceAccountNumber, that.sourceAccountNumber) && Objects.equals(destinationAccountNumber, that.destinationAccountNumber) && operation == that.operation && Objects.equals(date, that.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sourceAccountNumber, destinationAccountNumber, operation, amount, date);
	}
}
