package ir.freeland.springboot.dto.inputdto;

import ir.freeland.springboot.annotation.IranianNationalCode;
import jakarta.validation.constraints.NotBlank;

public class FindPersonInputDto {
	
	@IranianNationalCode
	@NotBlank(message = "nationalCode is required")
	private String nationalCode;

	public FindPersonInputDto() {
		super();
		
	}

	public FindPersonInputDto(String nationalCode) {
		super();
		this.nationalCode = nationalCode;
	}

	public String getNationalCode() {
		return nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	
	
}
