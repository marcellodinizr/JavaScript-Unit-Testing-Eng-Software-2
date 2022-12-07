package dcomp.es2.locadora.repository;

import javax.persistence.EntityManager;

import dcomp.es2.locadora.models.Imovel;

public class ImovelRepository extends DAOGenerico<Imovel> {

	private EntityManager manager;

	public ImovelRepository(EntityManager manager) {
		super(manager, Imovel.class);
		this.manager = manager;
	}
}
