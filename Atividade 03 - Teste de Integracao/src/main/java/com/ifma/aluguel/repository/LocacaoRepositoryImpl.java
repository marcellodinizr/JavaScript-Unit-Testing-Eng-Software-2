package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Locacao;
import java.util.List;
import javax.persistence.EntityManager;

public class LocacaoRepositoryImpl
		implements com.ifma.aluguel.repository.LocacaoRepository {

	private EntityManager manager;

	public LocacaoRepositoryImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Locacao getById(Integer idLocacao) {
		List<Locacao> listaRetorno = manager
				.createQuery(
						"from Locacao a where a.id_locacao = :id_locacao",
						Locacao.class)
				.setParameter("id_locacao", idLocacao)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public Locacao salvarLocacao(Locacao locacao) {
		manager.persist(locacao);
		manager.refresh(locacao);
		return locacao;
	}

	@Override
	public boolean atualizarLocacao(Locacao locacao) {
		manager.merge(locacao);
		return true;
	}

	@Override
	public boolean deletarLocacao(Locacao locacao) {
		manager.remove(locacao);
		return true;
	}
}
