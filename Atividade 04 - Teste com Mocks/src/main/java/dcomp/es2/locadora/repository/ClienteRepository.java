package dcomp.es2.locadora.repository;

import javax.persistence.EntityManager;

import dcomp.es2.locadora.models.Cliente;

public class ClienteRepository extends DAOGenerico<Cliente> {

	private EntityManager manager;

	public ClienteRepository(EntityManager manager) {
		super(manager, Cliente.class);
		this.manager = manager;
	}
}
