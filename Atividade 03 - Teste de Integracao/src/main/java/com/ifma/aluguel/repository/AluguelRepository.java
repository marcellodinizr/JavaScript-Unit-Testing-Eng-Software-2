package com.ifma.aluguel.repository;

import java.util.List;

import com.ifma.aluguel.models.Aluguel;
import com.ifma.aluguel.models.Locacao;

public interface AluguelRepository {

	public Aluguel getById(Integer id_aluguel);

	public Locacao buscarLocacaoDoAluguel(Aluguel aluguel);

	public List<Aluguel> getAlugueisDisponiveis(Aluguel aluguel_base);

	public Aluguel salvarAluguel(Aluguel aluguel);

	public boolean atualizarAluguel(Aluguel aluguel);

	public boolean deletarAluguel(Aluguel aluguel);
}
