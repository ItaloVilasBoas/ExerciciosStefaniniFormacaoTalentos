package com.stefanini.aula05;

public class Operadores {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int x = 10;

		// Operadores Aritmeticos
		System.out.println(a + b); // soma
		System.out.println(a * b); // multiplicação
		System.out.println(a / b); // divisão
		System.out.println(a % b); // modulo

		a += b; // aditivo
		a -= b; // subtrativo
		a *= b; // multiplicativo
		a /= b; // divisivo
		a %= b; // modular

		// Operadores Unarios
		System.out.println(x++); // incremento posfixo 10 (11)
		System.out.println(++x); // incremento prefixo 12
		System.out.println(x--); // decremento posfixo 12 (11)
		System.out.println(--x); // decreento prefixo 10
		System.out.println(~x); // negacao (-10)

		// Operadores relacionais
		System.out.println(12 == 10);// igual a (false)
		System.out.println(5 != 6); // diferente de (true)
		System.out.println(10 > 5); // maior que (true)
		System.out.println(5 < 10); // menor que (true)
		System.out.println(10 >= 10); // maior igual (true)
		System.out.println(10 <= 10); // menor igual (true)

		// Operadores Logicos
		// AND
		// V and F => F
		// V and V => V
		// F and V => F
		// F and F => F
		// OR
		// V and F => V
		// V and V => V
		// F and V => V
		// F and F => F
		// XOR
		// V and F => V
		// V and V => F
		// F and V => V
		// F and F => F

	}
}
