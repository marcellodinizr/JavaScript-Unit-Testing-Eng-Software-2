package dcomp.es2.locadora.services;

import java.util.List;

import dcomp.es2.locadora.erros.ErrorAoEnviarEmailException;
import dcomp.es2.locadora.models.Aluguel;

public class EnviadorDeEmail {

	private EmailService emailService;

	public EnviadorDeEmail(EmailService emailService) {
		this.emailService = emailService;
	}

	public void notificarClientesAtrasados(AluguelService aluguelService) {
		List<Aluguel> alugueis = aluguelService.obterAlugueisAtrasados();

		alugueis.forEach(a -> {
			// EmailMessage message = new EmailMessage();
			// message.fromAluguelAtrasado(a);
			try {
				this.emailService.notifica(a.getLocacao().getInquilino());
			} catch (ErrorAoEnviarEmailException e) {
				System.out.println(e.getMessage());
			}
		});
	}
}
