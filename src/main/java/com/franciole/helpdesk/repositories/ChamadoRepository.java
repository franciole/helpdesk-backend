package com.franciole.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciole.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
