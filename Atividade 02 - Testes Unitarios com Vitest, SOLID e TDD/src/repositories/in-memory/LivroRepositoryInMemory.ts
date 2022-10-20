import { Livro } from "../../entities/Livro";
import { LivroRepository } from "../LivroRepository";

export class LivroRepositoryInMemory implements LivroRepository {
	public livros: Livro[] = [];

	async create(livro: Livro): Promise<void> {
		this.livros.push(livro);
	}
}