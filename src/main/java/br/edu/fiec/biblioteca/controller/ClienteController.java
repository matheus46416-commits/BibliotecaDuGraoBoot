package br.edu.fiec.biblioteca.controller;

import br.edu.fiec.market.model.Cliente;
import br.edu.fiec.market.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "cliente")
public class ClienteController{

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	public void registarCliente(@RequestBody Cliente cliente){
		clienteService.registrar(cliente);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(produces = APPLICATION_JSON_VALUE)
	public Cliente consultarPorId(@RequestParam Integer id){
		return clienteService.consultarPorId(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "todos",produces = APPLICATION_JSON_VALUE)
	public List<Cliente> consultarTodos(){
		return clienteService.consultarTodos(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping(consumes = APPLICATION_JSON_VALUE)
	public void atualizarInfo(@RequestParam Integer id, @RequestBody Cliente cliente){
		clienteService.atualizarInfo(id,cliente);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deletar(@RequestParam Integer id){
		clienteService.deletar(id);
	}
}
