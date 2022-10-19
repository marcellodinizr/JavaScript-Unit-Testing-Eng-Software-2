export interface UsuarioProps {
 nome: string;
 emDebito: boolean;
}

export class Usuario {
	private props: UsuarioProps

	 get nome(): string {
		return this.props.nome
	 }

	 get emDebito(): boolean {
		return this.props.emDebito
	 }

	 constructor(props: UsuarioProps) {
		this.props = props
	 }
	}