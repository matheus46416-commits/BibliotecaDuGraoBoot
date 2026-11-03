package br.edu.fiec.biblioteca.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import br.edu.fiec.market.model.Livro;
import org.springframework.web.bind.annotation.*;
import br.edu.fiec.market.service.LivroService;

@RestController
@AllArgsConstructor
@RequestMapping(value = "livro")
public class LivroController{

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	public void registarLivro(@RequestBody Livro livro){
		livroService.registrar(livro);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = APPLICATION_JSON_VALUE)
	public Livro consultarPorId(@RequestParam Integer id){
		return livroService.consultarPorId(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "todos",produces = APPLICATION_JSON_VALUE)
	public List<Livro> consultarTodos(){
		return livroService.consultarTodos(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping(consumes = APPLICATION_JSON_VALUE)
	public void atualizarInfo(@RequestParam Integer id, @RequestBody Livro livro){
		livroService.atualizarInfo(id,livro);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deletar(@RequestParam Integer id){
		livroService.deletar(id);
	}
}
