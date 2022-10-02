package com.franciole.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciole.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
