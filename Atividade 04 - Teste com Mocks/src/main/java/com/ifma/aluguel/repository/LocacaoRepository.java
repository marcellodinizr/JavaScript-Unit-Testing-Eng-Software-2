package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Locacao;

public interface LocacaoRepository {
	public Locacao getById(Integer id_locacao);

	public Locacao salvar(Locacao locacao);

	public boolean atualizar(Locacao locacao);

	public boolean deletar(Locacao locacao);
}
