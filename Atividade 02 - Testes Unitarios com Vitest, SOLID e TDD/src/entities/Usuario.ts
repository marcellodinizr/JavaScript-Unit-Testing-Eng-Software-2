export interface UsuarioProps {
	id: string; 
  nome: string;
}

export class Usuario {
	private props: UsuarioProps

	 get nome(): string {
		return this.props.nome
	 }

	 get id(): string {
		return this.props.id
	 }

	 constructor(props: UsuarioProps) {
		this.props = props
	 }
}