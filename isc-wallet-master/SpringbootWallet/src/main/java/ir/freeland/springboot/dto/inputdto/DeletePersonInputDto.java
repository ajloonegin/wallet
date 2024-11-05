package ir.freeland.springboot.dto.inputdto;

import jakarta.validation.constraints.NotBlank;

public class DeletePersonInputDto {
	
	@NotBlank(message = "id is required")
	private long id;

	public DeletePersonInputDto() {
		super();
		
	}

	public DeletePersonInputDto(long id) {
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
