package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Cliente;

public interface ClienteRepository {

	public Cliente getById(Integer idCliente);

	public Cliente getClienteByCpf(String cpf);

	public Cliente salvar(Cliente cliente);

	public boolean atualizar(Cliente cliente);

	public boolean deletar(Cliente cliente);
}
