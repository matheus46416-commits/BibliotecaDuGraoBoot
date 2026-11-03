package br.edu.fiec.biblioteca.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario{
	
	String nome,email,senha,endereco;
	Integer telefone;

}
