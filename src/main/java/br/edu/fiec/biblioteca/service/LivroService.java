package br.edu.fiec.biblioteca.service;

import java.util.List;
import java.util.ArrayList;
import br.edu.fiec.biblioteca.model.Livro;
import org.springframework.stereotype.Service;

@Service
public class LivroService{

	List<Livro> livros = new ArrayList<>();

	public void registrar(Livro livro){
		livro.add(livro);	
	}

	public Livro consultarPorId(Integer id){
		return this.livros.stream()
			.filter(livro ->
				livro.getId().equals(id))
			.findFirst()
			.orElse(null);
	}

	public List<Livro> consultarTodos(){
		return this.livros;	
	}

	public void atualizarInfo(Integer id, Livro livroAtualizado){
		if(livroAtualizado != null){
			Livro livroAtual = consultarPorId(id);
			livros.remove(livroAtual);
			livros.add(livroAtualizado);
		}
	}

	public void deletar(Integer id){
		livros.remove(consultarPorId(id));
	}

}
