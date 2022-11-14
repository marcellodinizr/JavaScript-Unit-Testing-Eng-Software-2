package com.ifma.aluguel.models;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aluguel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluguel")
	private Integer id_aluguel;

	@Column(name = "id_locacao")
	private Integer id_locacao;

	@Column(name = "data_vencimento")
	private Date data_vencimento;

	@Column(name = "valor_pago")
	private Double valor_pago;

	@Column(name = "data_pagamento")
	private Date data_pagamento;

	@Column(name = "obs")
	private String obs;
}
