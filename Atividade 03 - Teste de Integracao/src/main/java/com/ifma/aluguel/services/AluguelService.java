package com.ifma.aluguel.services;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifma.aluguel.models.Aluguel;
import com.ifma.aluguel.repository.AluguelRepository;
import com.ifma.aluguel.repository.AluguelRepositoryImpl;

public class AluguelService {

	private AluguelRepository aluguelRepository;

	public AluguelService(AluguelRepository aluguelRepository) {
		this.aluguelRepository = aluguelRepository;
	}

	public AluguelService() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database");
		this.aluguelRepository = new AluguelRepositoryImpl(emf.createEntityManager());
	}

	public Aluguel buscarAluguelPorId(Integer id_aluguel) {
		return aluguelRepository.getById(id_aluguel);
	}

	public List<Aluguel> getAlugueisDisponiveis(Aluguel aluguel_base) {
		return aluguelRepository.getAlugueisDisponiveis(aluguel_base);
	}

	public Aluguel salvarAluguel(Aluguel aluguel) {
		if (Objects.nonNull(aluguel.getId_aluguel())) {
			throw new Error();
		}
		return aluguelRepository.salvarAluguel(aluguel);
	}

	public boolean atualizarAluguel(Aluguel aluguel) {
		return aluguelRepository.atualizarAluguel(aluguel);
	}

	public boolean deletarAluguel(Aluguel aluguel) {
		return aluguelRepository.deletarAluguel(aluguel);
	}

}
