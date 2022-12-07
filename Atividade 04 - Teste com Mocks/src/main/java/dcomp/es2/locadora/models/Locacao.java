package dcomp.es2.locadora.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "locacoes")
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL)
	private Imovel imovel;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente inquilino;

	private Double valorAluguel;
	private Double percentualMuta;
	private Integer diaVencimento;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Boolean ativo;
	private String obs;

}
