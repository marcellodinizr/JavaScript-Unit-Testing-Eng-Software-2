package com.ifma.aluguel.models;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "locacao")
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_locacao")
	private Integer id_locacao;

	@Column(name = "id_cliente")
	private Integer id_cliente;

	@Column(name = "data_locacao")
	private LocalDate data_locacao;

	@Column(name = "data_prevista")
	private LocalDate data_prevista;

	@Column(name = "data_devolucao")
	private LocalDate data_devolucao;

	@Column(name = "valor_aluguel")
	private Double valor_aluguel;

	@Column(name = "percentual_multa")
	private Double percentual_multa;

	@Column(name = "dia_vencimento")
	private Integer dia_vencimento;

	@Column(name = "data_inicio")
	private Date data_inicio;

	@Column(name = "data_fim")
	private Date data_fim;

	@Column(name = "ativo")
	private Boolean ativo;

	@Column(name = "obs")
	private String obs;

}
