package br.com.cotiinformatica.application.dtos;

import lombok.Data;

@Data
public class CriarContaResponseDTO {
	
	private String mensagem;
	private String id;
	private String nome;
	private String email;

}
