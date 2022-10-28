export interface UsuarioProps {
	id: string; 
  nome: string;
}

export class Usuario {
	private props: UsuarioProps

	 get id(): string {
		return this.props.id
	 }

	 get nome(): string {
		return this.props.nome
	 }

	 constructor(props: UsuarioProps) {
		this.props = props
	 }
}