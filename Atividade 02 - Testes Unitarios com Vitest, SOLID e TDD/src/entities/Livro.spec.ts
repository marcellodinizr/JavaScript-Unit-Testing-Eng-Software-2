import { describe, expect, it } from 'vitest';

import { Livro } from './Livro';

describe('Classe: Livro', () => {
	it('deve realizar emprestimo de um livro não reservado', () => {
		const livro = new Livro({
			autor: 'John Doe',
			titulo: 'Game of Thrones',
			emprestado: true,
			reservado: false,
			historico: [],
		})
		
		expect(livro.reservado).toBe(false);
	})
	
	it('deve tentar realizar emprestimo de um livro reservado', () => {
		const livro = new Livro({
			autor: 'John Doe',
			titulo: 'Game of Thrones',
			emprestado: true,
			reservado: true,
			historico: [],
		})
		
		expect(livro.reservado).not.toBe(false);
	})
	
});