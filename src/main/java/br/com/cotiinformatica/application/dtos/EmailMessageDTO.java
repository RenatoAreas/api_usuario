package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class EmailMessageDTO {

	private String to;
	private String subject;
	private String body;
	
}
