package com.ifma.aluguel.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Imovel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_imovel")
	private Integer id_imovel;

	@Column(name = "tipo_imovel")
	private String tipo_imovel;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cep")
	private Integer cep;

	@Column(name = "metragem")
	private Double metragem;

	@Column(name = "dormitorios")
	private Integer dormitorios;

	@Column(name = "banheiros")
	private Integer banheiros;

	@Column(name = "suites")
	private Integer suites;

	@Column(name = "vagas_garagem")
	private Integer vagas_garagem;

	@Column(name = "valor_aluguel_sugerido")
	private Double valor_aluguel_sugerido;

	@Column(name = "obs")
	private String obs;
}
