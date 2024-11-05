package ir.freeland.springboot.dto.inputdto;

import jakarta.validation.constraints.NotBlank;

public class DeleteAccountInputDto {
	
	@NotBlank(message = "id is required")
	private long id;

	public DeleteAccountInputDto() {
		super();
		
	}

	public DeleteAccountInputDto(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
