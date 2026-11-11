package br.edu.fiec.biblioteca.model;

import lombok.Data;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Basic;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario{

	@Id
	@GeneratedValue
	private Integer id;
	@Basic
	private Integer cpf,telefone;
	private String nome,endereco,cpf;
	@Column (unique = true, nullable = false)
	private String email;
	@Column (nullable = false, length = 60)
	private String senha;

}
