package com.stefanini.orientacaoObjetos;

public class Tesla extends Carro{
	
	private boolean dirigeSozinho;
	
	public Tesla(){
		this.setMarca("Tesla");
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
}
