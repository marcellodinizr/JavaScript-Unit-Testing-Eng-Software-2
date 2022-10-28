import { Usuario } from "../entities/Usuario";

export interface UsuarioRepository {
	create(usuario: Usuario): Promise<void>;
}