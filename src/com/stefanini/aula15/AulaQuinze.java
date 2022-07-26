package com.stefanini.aula15;

public class AulaQuinze {
	public static void main(String[] args) {
		CarroAulaQuinze bmw = new CarroAulaQuinze();
		
		try {
			bmw.setVelocidade(-12);
		}catch(NegocioException e){
			System.out.println(e);
		}finally {
			System.out.println("Finalizando...");
		}
	}
}
