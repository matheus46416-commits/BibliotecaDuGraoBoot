package br.edu.fiec.biblioteca.model;

import lombok.Data;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import jakarta.persistence.Basic;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Livro{
	
	String isbn,titulo,genero,autor;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Basic
	boolean disponivel = true;
	String titulo,autor,genero,isbn;


}
