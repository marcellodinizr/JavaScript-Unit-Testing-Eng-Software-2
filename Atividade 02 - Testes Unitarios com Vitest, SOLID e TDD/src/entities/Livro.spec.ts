import { describe, expect, it } from 'vitest';

import { Livro } from './Livro';

describe('Classe: Livro', () => {
	it('criar um livro', () => {
		const livro = new Livro({
		 autor: 'John Doe',
		 titulo: 'Game of Thrones',
		 emprestado: true,
		 reservado: true,
		 historico: [],
		})
	 
		expect(livro).toBeInstanceOf(Livro);
})

});