import { Emprestimo } from "../entities/emprestimo";
import { Livro } from "../entities/livro";

interface CreateEmprestimoRequest {
	usuario: string;
	dataEmprestimo: Date;
	dataDevolucao: Date;
	dataPrevista: Date;
	livros: Array<Livro>;
} 

type CreateEmprestimoResponse = Emprestimo

export class CreateEmprestimo {
	async execute({
		usuario,
		dataEmprestimo,
		dataDevolucao,
		dataPrevista
}: CreateEmprestimoRequest): Promise<CreateEmprestimoResponse> {
			const emprestimo = new Emprestimo({
				usuario,
				dataEmprestimo,
				dataDevolucao,
				dataPrevista
			})

		return emprestimo
	}
}