package com.ifma.aluguel.repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.ifma.aluguel.models.Locacao;

public class LocacaoRepositoryImpl implements com.ifma.aluguel.repository.LocacaoRepository {

	private EntityManager manager;

	public LocacaoRepositoryImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Locacao getById(Integer idLocacao) {
		List<Locacao> listaRetorno = manager.createQuery("from Locacao a where a.id_locacao = :id_locacao", Locacao.class)
				.setParameter("id_locacao", idLocacao)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public Locacao salvar(Locacao locacao) {
		manager.persist(locacao);
		manager.refresh(locacao);
		return locacao;
	}

	@Override
	public boolean atualizar(Locacao locacao) {
		manager.merge(locacao);
		return true;
	}

	@Override
	public boolean deletar(Locacao locacao) {
		manager.remove(locacao);
		return true;
	}
}
