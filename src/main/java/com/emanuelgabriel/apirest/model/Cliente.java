package com.emanuelgabriel.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabela_cliente")
public class Cliente {

	/**
	 * Criando os atributos desta classe a serem consumidos na API
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private double cpfOucnpj;
	private String email;
	private double telefone;
	
	
    /**
     * Construtor vazio desta Classe
     */
	public Cliente() {
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	public double getCpfOucnpj() {
		return cpfOucnpj;
	}



	public void setCpfOucnpj(double cpfOucnpj) {
		this.cpfOucnpj = cpfOucnpj;
	}



	public double getTelefone() {
		return telefone;
	}



	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}



	
	
}
