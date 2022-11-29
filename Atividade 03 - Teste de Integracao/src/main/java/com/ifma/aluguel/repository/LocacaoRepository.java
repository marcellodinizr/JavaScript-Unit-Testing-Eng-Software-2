package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Locacao;

public interface LocacaoRepository {
	public Locacao getById(Integer id_locacao);

	public Locacao salvarLocacao(Locacao locacao);

	public boolean atualizarLocacao(Locacao locacao);

	public boolean deletarLocacao(Locacao locacao);
}
