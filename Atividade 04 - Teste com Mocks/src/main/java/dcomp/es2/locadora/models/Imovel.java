package dcomp.es2.locadora.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "imoveis")
public class Imovel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String tipoImovel;
	private String endereco;
	private String bairro;
	private Integer cep;
	private double metragem;
	private Integer dormitorios;
	private Integer banheiros;
	private Integer suites;
	private Integer vagasGaragem;
	private double valorAluguelSugerido;
	private String obs;

}
