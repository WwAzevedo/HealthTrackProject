/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;



public class Usuario {

	
	// Construtores
	public Usuario() {

	}
	
	Progresso progresso;
	
	public Usuario(Progresso progresso) {
		this.progresso = progresso;
	}
	
	public Usuario(String nome, double peso, double altura, String pressaoArterial, double imc) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}


	// Atributos
	private int usuarioID;
	private String nome;
	private double peso;
	private double altura;
	private double imc;
	private java.util.Date dt_registro;




	// Gets - Sets
	
	public java.util.Date getDt_registro() {
		return dt_registro;
	}

	public void setDt_registro(java.util.Date dt_registro) {
		this.dt_registro = dt_registro;
	}

	public String getNome() {
		return nome;
	}


	public int getUsuarioID() {
		return usuarioID;
	}


	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}

	
	// Metodos
	public void calculoImc(Progresso progresso) {

		this.imc = progresso.getPesoEstimadoQuilo() / (this.altura * this.altura);
	}
	


	public String tabelaImc() {
		if (this.imc >= 16 && this.imc <= 16.99) {
			System.out.println("  Você está muito abaixo do peso.");

		} else if (this.imc >= 17 && this.imc <= 18.49) {
			System.out.println("  Você está um pouco abaixo do peso.");

		} else if (this.imc >= 18.50 && this.imc <= 24.99) {
			System.out.println("  Parabéns! Você está com o seu peso ideal.");

		} else if (this.imc >= 25 && this.imc <= 29.99) {
			System.out.println("  Você está um pouco acima do peso.");

		} else if (this.imc >= 30 && this.imc <= 34.99) {
			System.out.println("  Obesidade Grau I");

		} else if (this.imc >= 35 && this.imc <= 39.99) {
			System.out.println("  Obesidade Grau II");

		} else if (this.imc < 16) {
			System.out.println("  Baixo peso Grau III");

		} else {
			System.out.println("  Obesidade Grau II");

		}
		return "";

	}


}
