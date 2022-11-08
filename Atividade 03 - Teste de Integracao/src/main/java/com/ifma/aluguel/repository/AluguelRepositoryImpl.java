package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Aluguel;
import com.ifma.aluguel.models.Locacao;

import javax.persistence.EntityManager;
import java.util.List;

public class AluguelRepositoryImpl implements com.ifma.aluguel.repository.AluguelRepository {

	private EntityManager manager;

	public AluguelRepositoryImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Aluguel getById(Integer id_aluguel) {
		List<Aluguel> listaRetorno = manager.createQuery("from Aluguel a where a.id_aluguel = :id_aluguel", Aluguel.class)
				.setParameter("id_aluguel", id_aluguel)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public Locacao buscarLocacaoDoAluguel(Aluguel aluguel) {
		List<Locacao> listaRetorno = manager.createQuery("from Locacao a where a.id_locacao = :id_locacao", Locacao.class)
				.setParameter("id_locacao", aluguel.getId_locacao())
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public List<Aluguel> getAlugueisDisponiveis(Aluguel aluguelBase) {
		String jsql = "from Aluguel a " +
				"where a.data_vencimento = COALESCE (:dataV=_vencimento,  a.data_vencimento)" +
				"and a.valor_pago = COALESCE (:valor_pago, a.valor_pago) " +
				"and  a.data_pagamento = COALESCE (:data_pagamento, a.data_pagamento) " +
				"and a.obs = COALESCE (:obs, a.obs)";

		return manager.createQuery(jsql, Aluguel.class)
				.setParameter("data_vencimento", aluguelBase.getData_vencimento())
				.setParameter("valor_pago", aluguelBase.getValor_pago())
				.setParameter("data_pagamento", aluguelBase.getData_pagamento())
				.setParameter("obs", aluguelBase.getObs())
				.getResultList();
	}

	// @Override
	// public List<Aluguel> getAlugueisPagos() {
	// String jsql = "from Aluguel a " +
	// "where a.valor_pago > 0 ";

	// return manager.createQuery(jsql, Aluguel.class).getResultList();
	// }

	// @Override
	// public List<Aluguel> getAlugueisPagosNaDataVencimento() {
	// String jsql = "from Aluguel a " +
	// "where a.valor_pago > 0 " +
	// "and a.data_vencimento = a.data_pagamento ";

	// return manager.createQuery(jsql, Aluguel.class).getResultList();
	// }

	@Override
	public Aluguel salvarAluguel(Aluguel aluguel) {
		manager.persist(aluguel);
		manager.refresh(aluguel);
		return aluguel;
	}

	@Override
	public boolean atualizarAluguel(Aluguel aluguel) {
		manager.merge(aluguel);
		return true;
	}

	@Override
	public boolean deletarAluguel(Aluguel aluguel) {
		manager.merge(aluguel);
		return true;
	}
}
