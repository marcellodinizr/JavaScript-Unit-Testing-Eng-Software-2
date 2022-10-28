import { Livro } from "./Livro";
import { Usuario } from "./Usuario";

export interface EmprestimoProps {
 usuario: Array<Usuario>;
 dataEmprestimo: Date;
 dataDevolucao: Date;
 dataPrevista: Date;
 livros: Array<Livro>;
}

export class Emprestimo {
	private props: EmprestimoProps

	get usuario(): Array<Usuario> {
		return this.props.usuario;
	}

	get dataEmprestimo(): Date {
		return this.props.dataEmprestimo
	}

	get dataDevolucao(): Date {
		return this.props.dataDevolucao
	}

	get dataPrevista(): Date {
    return this.props.dataPrevista
	}

	get livros(): Array<Livro> {
		return this.props.livros	
	}

	constructor(props: EmprestimoProps) {
		const {dataEmprestimo, dataDevolucao} = props

		if(dataEmprestimo <= new Date()) {
			throw new Error("Data de emprestimos inválidos")
		}

		if(dataDevolucao <= new Date()) {
			throw new Error("Data de devoluções inválidos")
		}

		this.props = props
	}
}

