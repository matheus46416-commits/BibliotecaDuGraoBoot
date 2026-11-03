package br.edu.fiec.biblioteca.service;

import java.util.List;
import java.util.ArrayList;
import br.edu.fiec.biblioteca.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService{

	List<Cliente> clientes = new ArrayList<>();

	public void registrar(Cliente cliente){
		clientes.add(cliente);	
	}

	public Cliente consultarPorId(Integer id){
		return this.clientes.stream()
			.filter(cliente ->
				cliente.getId().equals(id))
			.findFirst()
			.orElse(null);
	}

	public List<Cliente> consultarTodos(){
		return this.clientes;	
	}

	public void atualizarInfo(Integer id, Cliente clienteAtualizado){
		if(clienteAtualizado != null){
			Cliente clienteAtual = consultarPorId(id);
			clientes.remove(clienteAtual);
			clientes.add(clienteAtualizado);
		}
	}

	public void deletar(Integer id){
		clientes.remove(consultarPorId(id));
	}

}
