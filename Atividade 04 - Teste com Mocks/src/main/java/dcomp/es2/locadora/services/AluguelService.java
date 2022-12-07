package dcomp.es2.locadora.services;

import java.util.List;

import javax.persistence.EntityManager;

import dcomp.es2.locadora.models.Aluguel;
import dcomp.es2.locadora.repository.AluguelRepository;

public class AluguelService {

	private EntityManager manager;
	private AluguelRepository alugueis;

	public AluguelService(EntityManager manager) {
		this.manager = manager;
	}

	public AluguelService(EntityManager manager, AluguelRepository repo) {
		this(manager);
		alugueis = repo;
	}

	public Double pagarAluguel(Aluguel aluguel) {
		aluguel.setValorPago(null);
		return 0.;
	}

	public List<Aluguel> obterAlugueisAtrasados() {
		return alugueis.listaAtrasados();
	}
}
