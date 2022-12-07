package dcomp.es2.locadora.erros;

public class ErrorAoEnviarEmailException extends Exception {

	@Override
	public String getMessage() {
		return "Erro ao enviar email!";
	}
}
