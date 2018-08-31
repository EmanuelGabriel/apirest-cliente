package com.emanuelgabriel.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelgabriel.apirest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente findClienteById(long id);

	
	
}
