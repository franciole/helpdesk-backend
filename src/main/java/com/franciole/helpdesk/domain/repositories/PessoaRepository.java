package com.franciole.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciole.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
