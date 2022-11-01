import { Emprestimo } from "../entities/emprestimo";
import { Livro } from "../entities/livro";
import { Usuario } from "../entities/Usuario";

interface CreateEmprestimoRequest {
	usuario: Array<Usuario>;
	dataEmprestimo: Date;
	dataDevolucao: Date;
	dataPrevista: Date;
	livros: Array<Livro>;
} 

type CreateEmprestimoResponse = Emprestimo;

export class CreateEmprestimo {
	async execute({
		usuario,
		dataEmprestimo,
		dataDevolucao,
		dataPrevista,
		livros
}: CreateEmprestimoRequest): Promise<CreateEmprestimoResponse> {
			const emprestimo = new Emprestimo({
				usuario,
				dataEmprestimo,
				dataDevolucao,
				dataPrevista,
				livros
			})

		return emprestimo;
	}
}