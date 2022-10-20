import { describe, expect, it } from 'vitest';

import { getDataFutura, getDataPrevista } from '../tests/utils/GetData';
import { Emprestimo } from './Emprestimo';

describe('Classe: Emprestimo', () => {
	it('deve criar um emprestimo', () => {
		const dataEmprestimo = getDataFutura('2022-10-19')
		const dataDevolucao = getDataFutura('2022-10-20')
		const dataPrevista = getDataPrevista('2022-10-26')

		const emprestimo = new Emprestimo({
			usuario: 'Marcello',
			dataEmprestimo,
			dataDevolucao,
			dataPrevista,
			livros: [],
		})

		expect(emprestimo).toBeInstanceOf(Emprestimo)
		expect(emprestimo.usuario).toEqual('Marcello')
	})

	it('não deve criar um emprestimo com a data de devolucao antes da data de emprestimo', () => {
		const dataEmprestimo = getDataFutura('2022-10-19')
		const dataDevolucao = getDataFutura('2022-10-18')
		const dataPrevista = getDataPrevista('2022-10-26')

		expect(() => {
			return new Emprestimo({
				usuario: 'Marcello',
        dataEmprestimo,
				dataDevolucao,
				dataPrevista,
			})
		})
	})

	it('não deve criar um emprestimo com a data antes de  agora', () => {
		const dataEmprestimo = new Date()
		const dataDevolucao = new Date()
		const dataPrevista = new Date()

		dataEmprestimo.setDate(dataEmprestimo.getDate() - 1)
		dataDevolucao.setDate(dataDevolucao.getDate() + 3)

		expect(() => {
			return new Emprestimo({
				usuario: 'Marcello',
        dataEmprestimo,
				dataDevolucao,
				dataPrevista,
			})
		})
	})

});