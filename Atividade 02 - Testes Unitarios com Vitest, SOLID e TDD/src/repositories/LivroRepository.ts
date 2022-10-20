import { Livro } from "../entities/Livro";

export interface LivroRepository {
	create(livro: Livro): Promise<void>;
}