/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;


public class Progresso {

	// Construtores

	public Progresso() {

	}

	Usuario usuario;
	Exercicio exercicio;
	Dieta dieta;

	public Progresso(Usuario usuario, Exercicio exercicio, Dieta dieta) {
		this.usuario = usuario;
		this.exercicio = exercicio;
		this.dieta = dieta;

	}

	public Progresso(int progressoID, int massa, int gordura, int caloria, int proteina, double pesoEstimadoQuilo, double pesoEstimadoGrama) {
		super();
		
		this.progressoID = progressoID;
		this.massa = massa;
		this.gordura = gordura;
		this.caloria = caloria;
		this.proteina = proteina;
		this.pesoEstimadoQuilo = pesoEstimadoQuilo;
		this.pesoEstimadoGrama = pesoEstimadoGrama;
	}


	// Atributos
	private int progressoID;
	private int massa;
	private int gordura;
	private int caloria;
	private int proteina;
	private double pesoEstimadoQuilo;
	private double pesoEstimadoGrama;
	private java.util.Date dt_progresso;


	// Gets e Sets
	
	public int getProgressoID() {
		return progressoID;
	}

	public void setProgressoID(int progressoID) {
		this.progressoID = progressoID;
	}
	
	public java.util.Date getDt_progresso() {
		return dt_progresso;
	}

	public void setDt_progresso(java.util.Date dt_progresso) {
		this.dt_progresso = dt_progresso;
	}
	
	
	public double getPesoEstimadoQuilo() {
		return pesoEstimadoQuilo;
	}

	public void setPesoEstimadoQuilo(double pesoEstimadoQuilo) {
		this.pesoEstimadoQuilo = pesoEstimadoQuilo;
	}
	
	public double getPesoEstimadoGrama() {
		return pesoEstimadoGrama;
	}

	public void setPesoEstimadoGrama(double pesoEstimadoGrama) {
		this.pesoEstimadoGrama = pesoEstimadoGrama;
	}
	
	public int getMassa() {
		return massa;
	}


	public void setMassa(int massa) {
		this.massa = massa;
	}


	public int getGordura() {
		return gordura;
	}


	public void setGordura(int gordura) {
		this.gordura = gordura;
	}


	public int getCaloria() {
		return caloria;
	}


	public void setCaloria(int caloria) {
		this.caloria = caloria;
	}


	public int getProteina() {
		return proteina;
	}


	public void setProteina(int proteina) {
		this.proteina = proteina;
	}


	public void calcPesoEstimado(Usuario usuario, Dieta dieta, Exercicio exercicio) {

		this.setPesoEstimadoQuilo(((usuario.getPeso() * 1000) + ((exercicio.calcMassaMuscularGrama() - exercicio.calcGorduraPerdidaGrama())
				+ dieta.calcGorduraGanhaGrama())) / 1000);
	}

	public void calcGramaPeso(Usuario usuario, Dieta dieta, Exercicio exercicio) {

		this.setPesoEstimadoGrama(((((usuario.getPeso() * 1000)
				+ ((exercicio.calcMassaMuscularGrama() - exercicio.calcGorduraPerdidaGrama())
						+ dieta.calcGorduraGanhaGrama()))
				/ 1000) % 1) * 1000); 
	}
	
	
}
