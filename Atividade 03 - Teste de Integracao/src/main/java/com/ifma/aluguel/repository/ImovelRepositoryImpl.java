package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Imovel;
import java.util.List;
import javax.persistence.EntityManager;

public class ImovelRepositoryImpl
		implements com.ifma.aluguel.repository.ImovelRepository {

	private EntityManager manager;

	public ImovelRepositoryImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Imovel getById(Integer id_imovel) {
		List<Imovel> listaRetorno = manager
				.createQuery("from Imovel i where i.id_imovel = :id_imovel", Imovel.class)
				.setParameter("id_imovel", id_imovel)
				.getResultList();

		return listaRetorno.size() > 0 ? listaRetorno.get(0) : null;
	}

	@Override
	public List<Imovel> getImoveisDisponiveis(Imovel imovel_base) {
		String query = "from Imovel i " +
				"where i.tipo_imovel = COALESCE (:tipo_imovel, i.tipo_imovel) " +
				"and i.endereco = COALESCE (:endereco, i.endereco) " +
				"and i.bairro = COALESCE (:bairro, i.bairro) " +
				"and i.cep = COALESCE (:cep, i.cep) " +
				"and i.metragem = COALESCE (:metragem, i.metragem) " +
				"and i.dormitorios = COALESCE (:dormitorios, i.dormitorios) " +
				"and i.banheiros = COALESCE (:banheiros, i.banheiros) " +
				"and i.suites = COALESCE (:suites, i.suites) " +
				"and i.vagas_garagem = COALESCE (:vagas_ga	ragem, i.vagas_garagem) " +
				"and i.valor_aluguel_sugerido = COALESCE (:valor_aluguel_sugerido, i.valor_aluguel_sugerido) " +
				"and i.obs = COALESCE (:obs, i.obs) " +
				"and not exists (select 0 from Locacao l where l.id_imovel = i.id_imovel  and l.ativo = true)";

		List<Imovel> listaRetorno = manager
				.createQuery(query, Imovel.class)
				.setParameter("tipo_imovel", imovel_base.getTipo_imovel())
				.setParameter("endereco", imovel_base.getEndereco())
				.setParameter("bairro", imovel_base.getBairro())
				.setParameter("cep", imovel_base.getCep())
				.setParameter("metragem", imovel_base.getMetragem())
				.setParameter("dormitorios", imovel_base.getDormitorios())
				.setParameter("banheiros", imovel_base.getBanheiros())
				.setParameter("suites", imovel_base.getSuites())
				.setParameter("vagas_garagem", imovel_base.getVagas_garagem())
				.setParameter(
						"valor_aluguel_sugerido",
						imovel_base.getValor_aluguel_sugerido())
				.setParameter("obs", imovel_base.getObs())
				.getResultList();

		return listaRetorno;
	}

	@Override
	public Imovel salvar(Imovel imovel) {
		manager.persist(imovel);
		manager.refresh(imovel);
		return imovel;
	}

	@Override
	public boolean atualizar(Imovel imovel) {
		manager.merge(imovel);
		return true;
	}

	@Override
	public boolean deletar(Imovel imovel) {
		manager.remove(manager.contains(imovel) ? imovel : manager.merge(imovel));
		return true;
	}
}
