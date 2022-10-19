import { parseISO, setDate, setYear } from "date-fns";

export function getDataFutura(date : string): Date {
	return setYear(parseISO(date), new Date().getFullYear() + 1);
}

export function getDataPrevista(date : string): Date {
	return setDate(parseISO(date), new Date().getDate() + 7)
}

