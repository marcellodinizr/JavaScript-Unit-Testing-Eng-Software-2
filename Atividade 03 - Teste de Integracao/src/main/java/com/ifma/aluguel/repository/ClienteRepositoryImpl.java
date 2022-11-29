package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Cliente;
import java.util.List;
import javax.persistence.EntityManager;

public class ClienteRepositoryImpl
		implements com.ifma.aluguel.repository.ClienteRepository {

	private EntityManager manager;

	public ClienteRepositoryImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Cliente getById(Integer id_cliente) {
		List<Cliente> listaRetorno = manager
				.createQuery(
						"from Cliente i where i.id_cliente = :id_cliente",
						Cliente.class)
				.setParameter("id_cliente", id_cliente)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public Cliente getClienteByCpf(String cpf) {
		List<Cliente> listaRetorno = manager
				.createQuery("from Cliente i where i.cpf = :cpf", Cliente.class)
				.setParameter("cpf", cpf)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public Cliente salvarCliente(Cliente cliente) {
		manager.persist(cliente);
		manager.refresh(cliente);
		return cliente;
	}

	@Override
	public boolean atualizarCliente(Cliente cliente) {
		manager.merge(cliente);
		return true;
	}

	@Override
	public boolean deletarCliente(Cliente cliente) {
		manager.remove(cliente);
		return true;
	}
}
