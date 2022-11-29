package com.ifma.aluguel.repository;

import com.ifma.aluguel.models.Cliente;

public interface ClienteRepository {

	public Cliente getById(Integer idCliente);

	public Cliente getClienteByCpf(String cpf);

	public Cliente salvarCliente(Cliente cliente);

	public boolean atualizarCliente(Cliente cliente);

	public boolean deletarCliente(Cliente cliente);
}
