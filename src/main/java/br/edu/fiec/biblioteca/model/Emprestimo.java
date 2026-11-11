package br.edu.fiec.biblioteca.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Basic
	private String Situacao;
	private Integer dataEmprestimo;
  private Integer dataDevolucao;
  private Cliente cliente;
  private Livro livro;
  private Funcionario funcionario;
}
