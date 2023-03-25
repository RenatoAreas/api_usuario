package br.com.cotiinformatica.domain.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "usuarios")
public class Usuario {

	@Id
	private String id;

	private String nome;

	@Indexed(unique = true)
	private String email;

	private String senha;

	private Instant dataHoraCriacao;

	private Instant dataHoraUltimaAlteracao;

}
