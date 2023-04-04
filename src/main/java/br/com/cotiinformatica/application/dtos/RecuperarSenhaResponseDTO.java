package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class RecuperarSenhaResponseDTO {
	
	private String message;
	private String id;
	private String nome;
	private String email;

}
