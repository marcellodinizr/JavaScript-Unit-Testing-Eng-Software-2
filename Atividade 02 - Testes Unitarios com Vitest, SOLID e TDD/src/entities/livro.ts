import { Emprestimo } from "./emprestimo";

export interface LivroProps {
	autor: string
	titulo: string
 	emprestado: boolean
	historico: Array<Emprestimo>
}

export class Livro {
	private props: LivroProps
	
	get autor(): string { 
		return this.props.autor
	}

	get titulo(): string {
		return this.props.titulo
	}

	get emprestado(): boolean {
		return this.props.emprestado
	}

	get historico(): Array<Emprestimo> {
		return this.props.historico
	}

	constructor(props: LivroProps) {
		this.props = props
	}
}