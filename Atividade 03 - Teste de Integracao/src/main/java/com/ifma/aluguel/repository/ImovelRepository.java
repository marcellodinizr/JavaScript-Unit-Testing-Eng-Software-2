package com.ifma.aluguel.repository;

import java.util.List;

import com.ifma.aluguel.models.Imovel;

public interface ImovelRepository {

	public Imovel getById(Integer id_imovel);

	public List<Imovel> getImoveisDisponiveis(Imovel imovel_base);

	// public List<Imovel> getImoveisDisponiveisAbaixoDoValor(Double
	// valor_sugerido);

	public Imovel salvar(Imovel imovel);

	public boolean atualizar(Imovel imovel);

	public boolean deletar(Imovel imovel);
}
