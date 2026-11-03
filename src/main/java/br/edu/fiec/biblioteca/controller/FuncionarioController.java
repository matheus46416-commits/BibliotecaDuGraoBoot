package br.edu.fiec.biblioteca.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import br.edu.fiec.market.model.Funcionario;
import org.springframework.web.bind.annotation.*;
import br.edu.fiec.market.service.FuncionarioService;

@RestController
@AllArgsConstructor
@RequestMapping(value = "funcionario")
public class FuncionarioController{

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	public void registarFuncionario(@RequestBody Funcionario funcionario){
		funcionarioService.registrar(funcionario);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = APPLICATION_JSON_VALUE)
	public Funcionario consultarPorId(@RequestParam Integer id){
		return funcionarioService.consultarPorId(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "todos",produces = APPLICATION_JSON_VALUE)
	public List<Funcionario> consultarTodos(){
		return funcionarioService.consultarTodos(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping(consumes = APPLICATION_JSON_VALUE)
	public void atualizarInfo(@RequestParam Integer id, @RequestBody Funcionario funcionario){
		funcionarioService.atualizarInfo(id,funcionario);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deletar(@RequestParam Integer id){
		funcionarioService.deletar(id);
	}
}
