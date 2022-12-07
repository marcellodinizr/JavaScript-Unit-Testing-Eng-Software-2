import { describe, expect, it } from 'vitest';

import { Usuario } from './Usuario';

describe('Classe: Usuario', () => {
	it('deve criar um usuario', () => {
		const usuario = new Usuario({
			id: '1',
			nome: 'Marcello',
		})

		expect(usuario.nome).to.equal('Marcello');
	})

	it('não deve criar usuarios coom IDs iguais', () => {
		const usuario1 = new Usuario({
			id: '1',
			nome: 'Marcello',
		})

		const usuario2 = new Usuario({
			id: '1',
			nome: 'Marcello'
		})

		expect(usuario1.id).to.equal(usuario2.id);
	})
});