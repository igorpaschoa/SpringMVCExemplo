package br.com.treinaweb.springmvc.dominios;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Filme {
	
	@NotNull(message = "O nome é obrigatório")
	@NotEmpty(message = "O nome é obrigatório")
	@Size(min = 4, max = 20, message = "O nome deve conter entre 4 e 20 caracteres")
	private String nome;
	
	@NotNull(message = "O genero é obrigatório")
	@NotEmpty(message = "O genero é obrigatório")
	@Size(min = 4, max = 20, message = "O genero deve conter entre 4 e 20 caracteres")
	private String genero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
