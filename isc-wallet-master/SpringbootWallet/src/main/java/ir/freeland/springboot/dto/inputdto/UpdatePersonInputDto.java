package ir.freeland.springboot.dto.inputdto;

import java.time.LocalDate;
import java.util.Date;

import ir.freeland.springboot.annotation.IranianNationalCode;
import ir.freeland.springboot.annotation.MilitaryStatusRequired;
import ir.freeland.springboot.model.constant.Gender;
import ir.freeland.springboot.model.constant.MilitaryStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;



@MilitaryStatusRequired
public class UpdatePersonInputDto {
	
	@NotBlank(message = "id is required")
	private long id;
	
	@NotBlank(message = "name is required")
	private String name;
	
	@NotBlank(message = "surName is required")
	private String surName;
	
	@IranianNationalCode
	@NotBlank(message = "nationalCode is required")
	private String nationalCode;
	
	@NotBlank(message = "birthDate is required")
	private Date birthDate;
	
	@Pattern(regexp = "(0|\\+98)?([ ]|-|[()]){0,2}9[1|2|3|4]([ ]|-|[()]){0,2}(?:[0-9]([ ]|-|[()]){0,2}){8}")
	@NotBlank(message = "mobileNumber is required")
	private String mobileNumber;
	
	@Enumerated(EnumType.STRING)
	@NotBlank(message = "gender is required")
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private MilitaryStatus militaryStatus;
	
	@NotBlank(message = "email is required")
	@Email(message = "Invalid email address")
	private String email;
	
	public UpdatePersonInputDto() {
		super();
		
	}
	
	
	public UpdatePersonInputDto(long id, String name, String surName, String nationalCode, Date birthDate,
			String mobileNumber, Gender gender, MilitaryStatus militaryStatus, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.nationalCode = nationalCode;
		this.birthDate = birthDate;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.militaryStatus = militaryStatus;
		this.email = email;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getNationalCode() {
		return nationalCode;
	}
	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public MilitaryStatus getMilitaryStatus() {
		return militaryStatus;
	}
	public void setMilitaryStatus(MilitaryStatus militaryStatus) {
		this.militaryStatus = militaryStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
