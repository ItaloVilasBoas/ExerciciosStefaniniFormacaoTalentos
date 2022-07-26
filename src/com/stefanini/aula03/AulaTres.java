package com.stefanini.aula03;

public class AulaTres {
	public static void main(String[] args) {
		boolean varBool = true; //true or false (1 bit)
		byte numByte = -128; //-128 a 127 (8 bits)
		short numShort = 32767; //-32768 a 32767 (16 bits)
		int numInt = 2147483647;//-2147483648 a 2147483647 (32 bits)
		long numLong = 9223372036854770000l;//-9223372036854770000 a 9223372036854770000l (64 bits)
		//long deve conter o 'l' no final, se for maior que 32 bits;
		
		float numFloat = 10.02f;// -1.4024E-37 a 3.40282347E+38 (32 bits)
		double numDouble = 1000000000000000.00;// -4.94E-307 a 1.79769313486231570E+308 (64 bits)
		
		char varChar = 'f';//0 a 65535 (16 bits)
		
		String texto = "Hello Devs";
		Integer numConta = 4000;
		Long numLongo = 1213123L;
		
	}
}
