package com.stefanini.aula14;

public class BreakContinue {
	public static void main(String[] args) {
		String[] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};
		String[] livros = new String[] {"Harry Potter", "Senhor dos Aneis", "As cronicas de Narnia", "Duna"};
		
		System.out.println("Exemplo break:");
		for(String livro : livros) {
			if(livro == "Senhor dos Aneis") {
				System.out.println(livro);
				break;
			}
		}
		System.out.println("\n\nExemplo continue:");
		for(String carro : carros) {
			if(carro == "BMW i320") {
				continue;
			}
			System.out.println("quero um " + carro);
		}
	}
}
