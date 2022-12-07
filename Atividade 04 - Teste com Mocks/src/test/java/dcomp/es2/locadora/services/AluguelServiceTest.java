package dcomp.es2.locadora.services;

import org.junit.jupiter.api.*;

import dcomp.es2.locadora.builder.AluguelBuilder;
import dcomp.es2.locadora.builder.ClienteBuilder;
import dcomp.es2.locadora.builder.ImovelBuilder;
import dcomp.es2.locadora.builder.LocacaoBuilder;
import dcomp.es2.locadora.models.Aluguel;
import dcomp.es2.locadora.models.Cliente;
import dcomp.es2.locadora.models.Imovel;
import dcomp.es2.locadora.models.Locacao;
import dcomp.es2.locadora.repository.AluguelRepository;

import dcomp.es2.locadora.repository.LocacaoRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AluguelServiceTest {

	private EntityManager manager;
	private static EntityManagerFactory emf;

	private LocacaoRepository locacoes;
	private AluguelRepository alugueis;

	private Cliente cliente;

	@BeforeAll
	public static void inicio() {
		emf = Persistence.createEntityManagerFactory("locadoraPU_test");
	}

	@BeforeEach
	public void antes() {
		manager = emf.createEntityManager();
		manager.getTransaction().begin();

		locacoes = new LocacaoRepository(manager);
		alugueis = new AluguelRepository(manager);

		cliente = ClienteBuilder.umCliente().comCpf(5555).comNome("Ricardo").constroi();

	}

	@AfterEach
	public void depois() {
		manager.getTransaction().rollback();
		cliente = null;
	}

	@AfterAll
	public static void fim() {
		emf.close();
	}

	// Recuperar uma lista com todos os alugueis pagos.
	@Test
	void deveListarAlugueisPagos() {
		Imovel imovel1 = ImovelBuilder.umImovel()
				.doTipo("residencia")
				.comValorAluguel(1500.)
				.comBairro("Monte Castelo").constroi();

		Locacao loc1 = LocacaoBuilder.umaLocacao().comInquilino(this.cliente).doImovel(imovel1).ativa(true).constroi();
		locacoes.salva(loc1);

		Aluguel al1 = AluguelBuilder.umAluguel().comLocacao(loc1).constroi();

	}

}
