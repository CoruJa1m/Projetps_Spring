package com.transportadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transportadora.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	List<Cliente> findAllByCidadeNome(String nome);
	
}
