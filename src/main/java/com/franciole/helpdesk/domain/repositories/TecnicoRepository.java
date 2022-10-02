package com.franciole.helpdesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciole.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
