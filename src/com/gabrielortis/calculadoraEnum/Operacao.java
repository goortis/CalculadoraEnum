package com.gabrielortis.calculadoraEnum;

public enum Operacao {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	private String simbolo;
	
	Operacao(String simbolo){
		this.simbolo = simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);

	public String getSimbolo() {
		return simbolo;
	}

	public String toString() {
		return this.simbolo;
	}
	
}
