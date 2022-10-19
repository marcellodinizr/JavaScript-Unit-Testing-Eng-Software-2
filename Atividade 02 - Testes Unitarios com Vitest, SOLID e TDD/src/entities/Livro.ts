import { Emprestimo } from "./Emprestimo";

export interface LivroProps {
	autor: string
	titulo: string
 	emprestado: boolean
	reservado: boolean
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

	get reservado(): boolean {
		return this.props.reservado
	}

	get historico(): Array<Emprestimo> {
		return this.props.historico
	}

	constructor(props: LivroProps) {
		this.props = props
	}
}