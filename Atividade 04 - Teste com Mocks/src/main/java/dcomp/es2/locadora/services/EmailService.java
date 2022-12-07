package dcomp.es2.locadora.services;

import dcomp.es2.locadora.erros.ErrorAoEnviarEmailException;
import dcomp.es2.locadora.models.Cliente;

public interface EmailService {

	public void notifica(Cliente cliente) throws ErrorAoEnviarEmailException;

}
