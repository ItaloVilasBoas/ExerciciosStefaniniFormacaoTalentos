package com.stefanini.orientacaoObjetos;

public class Main {
	public static void main(String[] args) {
		Carro[] carros = new Carro[4];
		carros[0] = new Tesla();
		carros[1] = new Tesla();
		carros[2] = new BMW();
		carros[3] = new BMW();
		
		carros[0].setModelo("Model Y");
		carros[0].setPlaca("YYY12345");
		carros[0].setVelocidade(90);
		((Tesla)carros[0]).setDirigeSozinho(true);
		carros[1].setModelo("Modelo X");
		carros[1].setPlaca("XXXX12345");
		carros[1].setVelocidade(80);
		((Tesla)carros[1]).setDirigeSozinho(false);
		carros[2].setModelo("X5");
		carros[2].setPlaca("1234XXXX");
		carros[2].setVelocidade(90);
		carros[3].setModelo("X3");
		carros[3].setPlaca("XXXX9999");
		carros[3].setVelocidade(99);
		
		for(Carro carro : carros) {
			System.out.print(carro.getMarca() + " " + carro.getModelo() + " ");
			if(carro instanceof Tesla) {
				System.out.print(((Tesla)carro).isDirigeSozinho());
			}
			System.out.println();
		}
		System.out.println(carros[0].calcularTaxaAceleracao(13, 13));
		System.out.println(carros[3].calcularTaxaAceleracao(13, 13));
	}
}
