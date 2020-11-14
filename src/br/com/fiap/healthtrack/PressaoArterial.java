package br.com.fiap.healthtrack;
import java.util.Date;

public class PressaoArterial {
	

	public PressaoArterial() {
		
	}
	public PressaoArterial(int pressaoID, String pressao, Date dt_pressao) {
		super();
		this.pressaoID = pressaoID;
		this.pressao = pressao;
		this.dt_pressao = dt_pressao;
	}
	private int pressaoID;
	private String pressao;
	private java.util.Date dt_pressao;
	
	
	public int getPressaoID() {
		return pressaoID;
	}
	public void setPressaoID(int pressaoID) {
		this.pressaoID = pressaoID;
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	}
	public java.util.Date getDt_pressao() {
		return dt_pressao;
	}
	public void setDt_pressao(java.util.Date dt_pressao) {
		this.dt_pressao = dt_pressao;
	}
}
