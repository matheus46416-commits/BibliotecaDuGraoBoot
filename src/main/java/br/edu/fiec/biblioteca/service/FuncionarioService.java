package br.edu.fiec.biblioteca.service;

import java.util.List;
import java.util.ArrayList;
import br.edu.fiec.biblioteca.model.Funcionario;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService{

	List<Funcionario> funcionarios = new ArrayList<>();

	public void registrar(Funcionario funcionario){
		funcionarios.add(funcionario);	
	}

	public Livro consultarPorId(Integer id){
		return this.funcionario.stream()
			.filter(funcionario ->
				funcionario.getId().equals(id))
			.findFirst()
			.orElse(null);
	}

	public List<Funcionario> consultarTodos(){
		return this.funcionarios;	
	}

	public void atualizarInfo(Integer id, Funcionario funcionarioAtualizado){
		if(funcionarioAtualizado != null){
			Funcionario funcionarioAtual = consultarPorId(id);
			funcionarios.remove(funcionarioAtual);
			funcionarios.add(funcionarioAtualizado);
		}
	}

	public void deletar(Integer id){
		funcionarios.remove(consultarPorId(id));
	}

}
