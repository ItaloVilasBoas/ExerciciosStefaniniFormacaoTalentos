package com.stefanini.aula18;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {
	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min, max);
	}
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Alice", "Joao", "Maria", "Pedro", "Paulo", "Samuel");
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15,30))).collect(Collectors.toList());
		List<Pessoa> pessoasMaior = pessoas.stream().filter((p) -> p.getIdade() > 17).collect(Collectors.toList());
		List<Pessoa> pessoasOrdem = pessoas.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		
		System.out.println("Lista de Pessoas: ");
		pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Lista de pessoas maiores de idade");
		pessoasMaior.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Lista de pessoas Ordenada por idade");
		pessoasOrdem.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.print("Soma das idades: ");
		System.out.println(pessoasOrdem.stream().map(p -> p.getIdade()).reduce(0,(somaIdade, idade) -> somaIdade += idade));
	}
}
