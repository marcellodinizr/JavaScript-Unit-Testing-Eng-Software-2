import { describe, expect, it } from "vitest";
import { getDataFutura, getDataPrevista } from "./GetData";

describe('Utils: GetData', () => {
	it('deve incrementar a data em um ano', () => {
		const ano = new Date().getFullYear();
	
		expect(getDataFutura(`${ano}-10-19`).getFullYear()).toEqual(2023)
	})
	
	it('deve incrementar em 7 dias', () => {
		const dia = new Date().getDate()
	
		expect(getDataPrevista(`2022-10-${dia}`).getDate()).toBe(3)
	})
})


