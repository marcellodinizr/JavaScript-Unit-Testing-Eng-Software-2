package com.ifma.aluguel.services;

import java.util.Objects;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifma.aluguel.models.Locacao;
import com.ifma.aluguel.repository.LocacaoRepository;
import com.ifma.aluguel.repository.LocacaoRepositoryImpl;

public class LocacaoService {

	private LocacaoRepository locacaoRepository;

	public LocacaoService(LocacaoRepository locacaoRepository) {
		this.locacaoRepository = locacaoRepository;
	}

	public LocacaoService() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database");
		this.locacaoRepository = new LocacaoRepositoryImpl(emf.createEntityManager());
	}

	public Locacao buscarLocacaoPorId(Integer id_locacao) {
		return locacaoRepository.getById(id_locacao);
	}

	public Locacao salvarLocacao(Locacao locacao) {
		if (Objects.nonNull(locacao.getId_locacao())) {
			throw new Error();
		}
		return locacaoRepository.salvarLocacao(locacao);
	}

	public boolean atualizarLocacao(Locacao locacao) {
		return locacaoRepository.atualizarLocacao(locacao);
	}

	public boolean deletarLocacao(Locacao locacao) {
		return locacaoRepository.deletarLocacao(locacao);
	}
}
