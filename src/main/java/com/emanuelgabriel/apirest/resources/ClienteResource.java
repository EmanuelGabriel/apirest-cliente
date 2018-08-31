package com.emanuelgabriel.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelgabriel.apirest.model.Cliente;
import com.emanuelgabriel.apirest.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="API RESTful de Clientes")
@RestController
@RequestMapping(value="/api/v1")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	/**
	 * Criando o método que irá listar todos os clientes na API
	 * Seu retorno deve vir todos os clientes cadastrados na API
	 * Tipo de Mapeamento: @GetMapping("/clientes")
	 * Tipo de método: return(com retorno de uma Lista de Cliente)
	 */
	@ApiOperation(value="Retorna uma lista de Clientes ou todos os Clientes já cadastrados.")
	@GetMapping("/clientes")
	public List<Cliente> listaCliente(){
		return clienteRepository.findAll();
	}
	
	
	/**
	 * Criando o método para listar APENAS um cliente na API
	 * Seu retorno deve vir apenas um cliente listado na API - fazendo a busca de clientes por ID
	 * Tipo de Mapeamento: @GetMapping("/cliente/{id}")
	 * Tipo de método: return(com retorno do tipo Cliente)
	 */
	@ApiOperation(value="Retorna um Cliente por seu Id.")
	@GetMapping("/cliente/{id}")
	public Cliente listaCliente(@PathVariable(value="id") long id) {
		return clienteRepository.findClienteById(id);
	}
	
	
	/**
	 * Criando o método para adicionar/salvar cliente na API
	 * Seu retorno deve adicionar os clientes na API
	 * Tipo de Mapeamento:  @PostMapping("/cliente")
	 * Tipo de método: return(com retorno do tipo Cliente)
	 */
	@ApiOperation(value="Salva um Cliente.")
	 @PostMapping("/cliente")
	 public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return  clienteRepository.save(cliente);
	 }
	 
	 
	 /**
	  * Criando o método para deletar/excluir o cliente da API
	  * Seu retorno deve deletar os clientes por seu ID
	  * Tipo de Mapeamento:  @DeleteMapping("/cliente")
	  * Tipo de método: void(sem retorno)
	  */
	 @ApiOperation(value="Deleta um Cliente cadastrado na API.")
	 @DeleteMapping("/cliente")
	 public void deletarCliente(@RequestBody @Valid Cliente cliente) {
		 clienteRepository.delete(cliente);
	 }
	 
	 
	 /**
	  * Criando o método para atualizar/editar o cliente na API
	  * Em seu retorno deverá atualizar ou editar o cliente por seu ID
	  * Tipo de Mapeamento:  @PutMapping("/cliente")
	  * Tipo de método: return(com retorno do tipo Cliente)
	  */
	 @ApiOperation(value="Atualiza ou edita um Cliente cadastrado na API.")
	 @PutMapping("/cliente")
	 public Cliente atualizarCliente(@RequestBody @Valid Cliente cliente) {
		 return clienteRepository.save(cliente);
	 }
	 
	 
	
	

}
