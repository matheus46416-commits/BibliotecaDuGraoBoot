package br.edu.fiec.biblioteca.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro{
	
	String isbn,titulo,genero,autor;

}
