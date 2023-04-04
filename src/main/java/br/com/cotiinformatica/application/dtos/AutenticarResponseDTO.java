package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class AutenticarResponseDTO {
	
	private String mensagem;
	
	private String id;
	
	private String nome;
	
	private String email;
	
	private String accessToken;

}
