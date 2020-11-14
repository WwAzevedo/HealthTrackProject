/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;


public class Dieta extends Progresso {


	// construtores
	public Dieta() {

	}

	public Dieta(int dietaID, String alimento, int quantidade, int porcoes, int caloriaAlimento, int proteinaAlimento,
			int gorduraGanhaDieta) {
		super();
		this.dietaID = dietaID;
		this.alimento = alimento;
		this.quantidade = quantidade;
		this.porcoes = porcoes;
		this.caloriaAlimento = caloriaAlimento;
		this.proteinaAlimento = proteinaAlimento;
		this.gorduraGanhaDieta = gorduraGanhaDieta;
	}

	// Atributos
	
	private int dietaID;
	private String alimento;
	private int quantidade;
	private int porcoes;
	private int caloriaAlimento;
	private int proteinaAlimento;
	private int gorduraGanhaDieta;
	private java.util.Date dt_dieta;

	// Gets e Sets
	
	
	
	
	public java.util.Date getDt_dieta() {
		return dt_dieta;
	}

	public void setDt_dieta(java.util.Date dt_dieta) {
		this.dt_dieta = dt_dieta;
	}

	public int getDietaID() {
		return dietaID;
	}

	public int getCaloriaAlimento() {
		return caloriaAlimento;
	}

	public void setCaloriaAlimento(int caloriaAlimento) {
		this.caloriaAlimento = caloriaAlimento;
	}

	public int getProteinaAlimento() {
		return proteinaAlimento;
	}

	public void setProteinaAlimento(int proteinaAlimento) {
		this.proteinaAlimento = proteinaAlimento;
	}

	public int getGorduraGanhaDieta() {
		return gorduraGanhaDieta;
	}

	public void setGorduraGanhaDieta(int gorduraGanhaDieta) {
		this.gorduraGanhaDieta = gorduraGanhaDieta;
	}

	public void setDietaID(int dietaID) {
		this.dietaID = dietaID;
	}
	
	public String getAlimento() {
		return alimento;
	}

	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPorcoes() {
		return porcoes;
	}

	public void setPorcoes(int porcoes) {
		this.porcoes = porcoes;
	}


	// metodos
	public void calcCaloriaGanha() {
		this.setCaloria(getCaloria() + ((int) (this.quantidade * 1.87) * this.porcoes));
	}

	public void calcGorduraGanha() {
		this.setGordura((getCaloria() * 1000) / 7700);
	}

	public int calcGorduraGanhaGrama() {
		return (getCaloria() * 1000) / 7700;
	}

	public void calcProteinaGanha() {
		this.setProteina((int) ((this.quantidade * 0.1) * this.porcoes));
	}

	
	public void calcQuantidade() {
		this.setQuantidade((int) this.quantidade * this.porcoes);
	}

	//

	public void calcCaloriaDieta() {
		this.caloriaAlimento = (int) ((this.quantidade * 1.87) * this.porcoes) / 2;

	}

	public void calcGorduraDieta() {
		this.gorduraGanhaDieta = (this.caloriaAlimento * 1000) / 7700;
	}

	public void calcProteinaDieta() {
		this.proteinaAlimento = (int) ((this.quantidade * 0.1) * this.porcoes);
	}

	

}
