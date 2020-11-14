/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;
;


public class Exercicio extends Progresso {

	
	// Construtores
	
	public Exercicio() {
		super();

	}


	
	

	
	public Exercicio(int exercicioID, String nomeExercicio, int repeticao, int serie, int massaMuscularGanha,
			int caloriaPerdida, int gorduraQueimada) {
		super();
		this.exercicioID = exercicioID;
		this.nomeExercicio = nomeExercicio;
		this.repeticao = repeticao;
		this.serie = serie;
		this.massaMuscularGanha = massaMuscularGanha;
		this.caloriaPerdida = caloriaPerdida;
		this.gorduraQueimada = gorduraQueimada;
	}






	// Atributos
	
	private int exercicioID;
	private String nomeExercicio;
	private int repeticao;
	private int serie;
	private int massaMuscularGanha;
	private int caloriaPerdida;
	private int gorduraQueimada;
	private java.util.Date dt_exercicio;
	
	// Gets e Sets
	
	
	
	
	
	
	public java.util.Date getDt_exercicio() {
		return dt_exercicio;
	}

	public void setDt_exercicio(java.util.Date dt_exercicio) {
		this.dt_exercicio = dt_exercicio;
	}

	public int getExercicioID() {
		return exercicioID;
	}


	public int getMassaExercicio() {
		return massaMuscularGanha;
	}


	public void setMassaExercicio(int massaMuscularGanha) {
		this.massaMuscularGanha = massaMuscularGanha;
	}


	public int getCaloriaExercicio() {
		return caloriaPerdida;
	}


	public void setCaloriaExercicio(int caloriaPerdida) {
		this.caloriaPerdida = caloriaPerdida;
	}


	public int getGorduraExercicio() {
		return gorduraQueimada;
	}


	public void setGorduraExercicio(int gorduraQueimada) {
		this.gorduraQueimada = gorduraQueimada;
	}


	public void setExercicioID(int exercicioID) {
		this.exercicioID = exercicioID;
	}

	public String getNomeExercicio() {
		return nomeExercicio;
	}


	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	
	public int getRepeticao() {
		return repeticao;
	}

	
	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}

	
	public int getSerie() {
		return serie;
	}

	
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	
	
	// metodos
	public void calcCaloriaPerdida() {
		this.setCaloria(getCaloria() + ((int) (this.repeticao * 0.7) * this.serie));
	}

	
	public void calcMassaMuscular() {

		this.setMassa(getMassa() + ((int) ((this.repeticao * 0.3) * this.serie)));
	}

	public int calcMassaMuscularGrama() {

		return getMassa();
	}

	
	public void calcGorduraPerdida() {
		this.setGordura((getCaloria() * 1000) / 7700);
	}

	public int calcGorduraPerdidaGrama() {
		return (getCaloria() * 1000) / 7700;
	}

	//
	public void calcCaloriaExercicio() {
		this.caloriaPerdida = (int) (this.repeticao * 0.7) * this.serie;
	}

	public void calcMassaExercicio() {
		this.massaMuscularGanha =   ((int) ((this.repeticao * 0.3) * this.serie));
	}

	public void calcGorduraExercicio() {
		this.gorduraQueimada = (this.caloriaPerdida * 1000) / 7700;
	}


	
}
