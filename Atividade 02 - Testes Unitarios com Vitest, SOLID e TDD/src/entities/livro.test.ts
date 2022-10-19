import { describe, expect, test } from 'vitest';

import { Livro } from './Livro';

describe('classe Livro', () => {
	test('criar um livro', () => {
		const livro = new Livro({
		 autor: 'John Doe',
		 titulo: 'Game of Thrones',
		 emprestado: true,
		 historico: [],
		})
	 
		expect(livro).toBeInstanceOf(Livro);
})

});