import { describe, expect, test } from 'vitest';

import { Emprestimo } from './emprestimo';

describe(' classe Emprestimo', () => {
	test('criar um emprestimo', () => {

		const emprestimo = new Emprestimo({
			usuario: 'Marcello',
			dataEmprestimo: new Date(),
			dataDevolucao: new Date(),
			livros: [],
		})

		expect(emprestimo).toBeInstanceOf(Emprestimo)
		expect(emprestimo.usuario).toEqual('Marcello')
	})

	test('não deve criar um emprestimo com a data de devolucao antes da data de emprestimo', () => {

	})
});