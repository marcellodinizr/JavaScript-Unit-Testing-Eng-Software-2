import { Emprestimo } from "../entities/Emprestimo";

export interface EmprestimoRepository {
	create(emprestimo: Emprestimo): Promise<void>;
}