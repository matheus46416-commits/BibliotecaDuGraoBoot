package br.edu.fiec.biblioteca.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente{
	
	private Integer id, telefone;
	private String nome,email,residencia;

}
