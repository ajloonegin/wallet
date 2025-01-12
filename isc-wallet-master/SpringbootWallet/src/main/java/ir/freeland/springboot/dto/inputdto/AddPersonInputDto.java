package ir.freeland.springboot.dto.inputdto;

import java.time.LocalDate;
import java.util.Date;

import ir.freeland.springboot.annotation.IranianNationalCode;
import ir.freeland.springboot.annotation.MilitaryStatusRequired;
import ir.freeland.springboot.model.constant.Gender;
import ir.freeland.springboot.model.constant.MilitaryStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@MilitaryStatusRequired
public class AddPersonInputDto {


	private String name;


	private String surName;


	private String nationalCode;


	private Date birthDate;


	private String mobileNumber;


	private Gender gender;


	private MilitaryStatus militaryStatus;


	private String email;

	public AddPersonInputDto() {
		super();

	}

	public AddPersonInputDto(String name, String surName, String nationalCode, Date birthDate, String mobileNumber,
			Gender gender, MilitaryStatus militaryStatus, String email) {
		super();
		this.name = name;
		this.surName = surName;
		this.nationalCode = nationalCode;
		this.birthDate = birthDate;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.militaryStatus = militaryStatus;
		this.email = email;
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
