package com.ifma.aluguel.models;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer id_cliente;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "email")
	private String email;

	@Column(name = "data_nascimento")
	private Date data_nascimento;
}