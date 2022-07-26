package com.stefanini.orientacaoObjetos;

public class BMW extends Carro{
	public BMW() {
		super();
		this.setMarca("BMW");
	}
	@Override
	public double calcularTaxaAceleracao(double vFinal, double tFinal) {
		return vFinal / tFinal;
	}
	
}
