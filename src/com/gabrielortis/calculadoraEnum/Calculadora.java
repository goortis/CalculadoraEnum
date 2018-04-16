package com.gabrielortis.calculadoraEnum;

public class Calculadora {

	public static void main(String[] args) {

		double x = 10;
		double y = 1.5;

		for(Operacao op : Operacao.values()) {
			System.out.println(x + " " + op.toString() + " " + y + " = " + op.executarOperacao(x, y) + "\n---");
		}
		
	}

}
