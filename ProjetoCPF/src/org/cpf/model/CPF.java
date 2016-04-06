package org.cpf.model;

public class CPF {
	private String entrada;
	private Integer[] entradaNumerica;

	public CPF(String entrada, Integer[] entradaNumerica) {
		super();
		this.entrada = entrada;
		this.entradaNumerica = entradaNumerica;
	}
	
	public CPF() {
		super();
		this.entrada = "00000000000";
		this.entradaNumerica = new Integer[11];
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public Integer[] getEntradaNumerica() {
		return entradaNumerica;
	}
	public void setEntradaNumerica(Integer[] entradaNumerica) {
		this.entradaNumerica = entradaNumerica;
	}

	@Override
	public String toString() {
		return "CPF [entrada=" + entrada + "]";
	}
		
}
