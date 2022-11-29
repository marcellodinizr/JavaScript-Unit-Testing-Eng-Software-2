package com.ifma.aluguel.services;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifma.aluguel.models.Imovel;
import com.ifma.aluguel.repository.ImovelRepository;
import com.ifma.aluguel.repository.ImovelRepositoryImpl;

public class ImovelService {

	private ImovelRepository imovelRepository;

	public ImovelService(ImovelRepository imovelRepository) {
		this.imovelRepository = imovelRepository;
	}

	public ImovelService() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database");
		this.imovelRepository = new ImovelRepositoryImpl(emf.createEntityManager());
	}

	public Imovel buscarImovelPorId(Integer id_imovel) {
		return imovelRepository.getById(id_imovel);
	}

	public List<Imovel> getImoveisDisponiveis(Imovel imovel_base) {
		return imovelRepository.getImoveisDisponiveis(imovel_base);
	}

	public Imovel salvarImovel(Imovel imovel) {
		if (Objects.nonNull(imovel.getId_imovel())) {
			throw new Error();
		}
		return imovelRepository.salvarImovel(imovel);
	}

	public boolean atualizarImovel(Imovel imovel) {
		return imovelRepository.atualizarImovel(imovel);
	}

	public boolean deletarImovel(Imovel imovel) {
		return imovelRepository.deletarImovel(imovel);
	}
}
