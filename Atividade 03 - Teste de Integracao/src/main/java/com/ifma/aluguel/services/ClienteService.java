package com.ifma.aluguel.services;

import java.util.Objects;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifma.aluguel.models.Cliente;
import com.ifma.aluguel.repository.ClienteRepository;
import com.ifma.aluguel.repository.ClienteRepositoryImpl;

public class ClienteService {

	private ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public ClienteService() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database");
		this.clienteRepository = new ClienteRepositoryImpl(emf.createEntityManager());
	}

	public Cliente buscarClientePorId(Integer id_cliente) {
		return clienteRepository.getById(id_cliente);
	}

	public Cliente buscarClientePorCpf(String cpf) {
		return clienteRepository.getClienteByCpf(cpf);
	}

	public Cliente salvarCliente(Cliente cliente) {
		if (Objects.nonNull(cliente.getId_cliente())) {
			throw new Error();
		}
		return clienteRepository.salvarCliente(cliente);
	}

	public boolean atualizarCliente(Cliente cliente) {
		return clienteRepository.atualizarCliente(cliente);
	}

	public boolean deletarCliente(Cliente cliente) {
		return clienteRepository.deletarCliente(cliente);
	}
}
