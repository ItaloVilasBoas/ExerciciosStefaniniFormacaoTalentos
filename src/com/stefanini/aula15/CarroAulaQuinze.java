package com.stefanini.aula15;

public class CarroAulaQuinze{
	private String marca;
	private String modelo;
	private String placa;
	private int velocidade;
	
	//Constructors
	public CarroAulaQuinze() {
		System.out.println("Construindo carro...");
	}
	public CarroAulaQuinze(String marca, String modelo, String placa, int velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.velocidade = velocidade;
	}
	
	//Methods
	public String acelerar() {
		return velocidade + "km/h";
	}
	public double calcularTaxaAceleracao(double vFinal, double vInicial, double tFinal, double tInicial) {
		return (vFinal - vInicial) / (tFinal - tInicial) * 3.6;
	}
	public double calcularTaxaAceleracao(double vFinal, double tFinal) {
		return calcularTaxaAceleracao(vFinal, 0, tFinal, 0);
	}
	//Getters and Setters
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) throws NegocioException {
		if(velocidade < 0) {
			throw new NegocioException("Valor invalido");
		}else {
			this.velocidade = velocidade;
		}
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
