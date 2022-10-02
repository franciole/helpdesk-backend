package com.franciole.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciole.helpdesk.domain.Chamado;
import com.franciole.helpdesk.domain.Cliente;
import com.franciole.helpdesk.domain.Tecnico;
import com.franciole.helpdesk.domain.enums.Perfil;
import com.franciole.helpdesk.domain.enums.Prioridade;
import com.franciole.helpdesk.domain.enums.Status;
import com.franciole.helpdesk.domain.repositories.ChamadoRepository;
import com.franciole.helpdesk.domain.repositories.ClienteRepository;
import com.franciole.helpdesk.domain.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Valdir Cezer", "63653230268", "valdir@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@gmail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
