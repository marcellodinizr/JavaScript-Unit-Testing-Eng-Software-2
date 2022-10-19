import { describe, expect, it } from 'vitest';
import { Emprestimo } from '../entities/emprestimo';
import { getDataFutura, getDataPrevista } from '../tests/utils/GetData';
import { CreateEmprestimo } from './CreateEmprestimo';

describe('Service: Criar um emprestimo', () => {
	it('deve ser possivel criar um emprestimo', () => {
		const createEmprestimo = new CreateEmprestimo()

		const dataEmprestimo = getDataFutura('2022-10-19')
		const dataDevolucao = getDataFutura('2022-10-21')
		const dataPrevista = getDataPrevista('2022-10-26')

		expect(createEmprestimo.execute({
			usuario: 'Marcello',
			dataEmprestimo,
			dataDevolucao,
			dataPrevista,
			livros: []
		})).resolves.toBeInstanceOf(Emprestimo)
	})
})