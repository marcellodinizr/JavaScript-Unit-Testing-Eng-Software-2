import { Livro } from "./livro";


export interface EmprestimoProps {
 usuario: string;
 dataEmprestimo: Date;
 dataDevolucao: Date;
 livros: Array<Livro>;
}

export class Emprestimo {
	private props: EmprestimoProps

	get usuario(): string {
		return this.props.usuario
	}

	get dataEmprestimo(): Date {
		return this.props.dataEmprestimo
	}

	get dataDevolucao(): Date {
		return this.props.dataDevolucao
	}

	constructor(props: EmprestimoProps) {
		this.props = props
	}
}

