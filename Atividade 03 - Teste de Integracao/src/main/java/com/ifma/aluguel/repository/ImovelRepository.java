package com.ifma.aluguel.repository;

import java.util.List;

import com.ifma.aluguel.models.Imovel;

public interface ImovelRepository {

	public Imovel getById(Integer id_imovel);

	public List<Imovel> getImoveisDisponiveis(Imovel imovel_base);

	public Imovel salvarImovel(Imovel imovel);

	public boolean atualizarImovel(Imovel imovel);

	public boolean deletarImovel(Imovel imovel);
}
