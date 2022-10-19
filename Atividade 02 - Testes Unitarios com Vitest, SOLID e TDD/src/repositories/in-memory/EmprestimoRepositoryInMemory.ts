import { Emprestimo } from "../../entities/Emprestimo";
import { EmprestimoRepository } from "../EmprestimoRepository";

export class EmprestimoRepositoryInMemory implements EmprestimoRepository {
	public emprestimos: Emprestimo[] = [];

	async create(emprestimo: Emprestimo): Promise<void> {
			this.emprestimos.push(emprestimo);
	}

}