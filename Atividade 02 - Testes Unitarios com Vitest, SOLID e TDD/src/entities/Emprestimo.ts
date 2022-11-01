import { Livro } from "./Livro";

export interface EmprestimoProps {
	usuario: string;
	dataEmprestimo: Date;
	dataDevolucao: Date;
	dataPrevista: Date;
	livros?: Array<Livro>;
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
	
	get dataPrevista(): Date {
		return this.props.dataPrevista
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

