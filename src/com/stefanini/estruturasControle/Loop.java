package com.stefanini.estruturasControle;

public class Loop {
	public static void main(String[] args) {
		int i = 0;
		//while
		while (i < 100) {
			System.out.println("valor de i: "+ i);
			i++;
		}
		int j = 101;
		//do while
		do {
			System.out.println("valor de j: " + j);
			j++;
		}while(j < 100);
		
		//for
		for(int k = 0; k < 100; k++) {
			System.out.println("valor de k: " + k);
		}
	}
}
