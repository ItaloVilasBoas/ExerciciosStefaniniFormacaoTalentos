package com.stefanini.aula17;

import com.stefanini.orientacaoObjetos.Carro;

public final class ClasseFinal {
	static int valor = 10;
	
	public static void main(String[] args) {
		Carro[] carros = new Carro[valor];
		carros[0] = new Carro();
		carros[0].setMarca("Porsche");
		carros[1] = new Carro();
		carros[1].setMarca("Chevrolet");
		carros[2] = new Carro();
		carros[2].setMarca("Toyota");
		carros[3] = new Carro();
		carros[3].setMarca("Honda");
		carros[4] = new Carro();
		carros[4].setMarca("Ferrari");
		carros[5] = new Carro();
		carros[5].setMarca("Porsche");
		valor = 5;
		for(int i = 0; i < valor; i++) {
			if(Constantes.MARCA_FAMOSAUM.equals(carros[i].getMarca()) || Constantes.MARCA_FAMOSADOIS.equals(carros[i].getMarca())) {
				System.out.println(carros[i].getMarca() + " e uma marca famosa");
			}
		}
	}
}
