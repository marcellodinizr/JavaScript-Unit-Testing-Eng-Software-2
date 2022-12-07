package dcomp.es2.locadora.repository;

import javax.persistence.EntityManager;

import dcomp.es2.locadora.models.Locacao;

public class LocacaoRepository extends DAOGenerico<Locacao> {

	private EntityManager manager;

	public LocacaoRepository(EntityManager manager) {
		super(manager, Locacao.class);
		this.manager = manager;
	}
}
