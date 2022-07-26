package com.stefanini.aula04;

public class AulaQuatro {
	public static void main(String[] args) {
		int notas[] = new int[10];
		String[] carros = new String[] {"BMW", "Mercedes", "Tesla"};
		
		notas[0] = 3;
		notas[1] = 4;
		notas[5] = 5;
		
		System.out.println(carros.length);
		for(String carro : carros) {
			System.out.println(carro);
		}
	}
}
