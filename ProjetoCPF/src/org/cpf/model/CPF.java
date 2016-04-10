package org.cpf.model;

public class CPF {
	private String entrada;
	private Integer[] entradaNumerica;
	
	public static final Integer TAM_CPF = 11;

	public CPF(String entrada) {
		super();
		this.entrada = entrada;
		this.entradaNumerica = new Integer[TAM_CPF];
		setEntradaNumerica(entrada);
	}
	
	public CPF() {
		super();
		this.entrada = "00000000000";
		this.entradaNumerica = new Integer[TAM_CPF];
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public void setEntrada(Integer[] entradaNumerica) {
		this.entrada = "";
		for (int i = 0; i < TAM_CPF; i++) {
			this.entrada = entrada.concat(String.valueOf(entradaNumerica[i]));
		}
	}
	
	public Integer[] getEntradaNumerica() {
		return entradaNumerica;
	}
	
	public Integer getEntradaNumericaAt(int index) {
		return entradaNumerica[index];
	}
	
	public void setEntradaNumericaAt(Integer value, int index) {
		entradaNumerica[index] = value;
		
		setEntrada(entradaNumerica);
	}
	
	public void setEntradaNumerica(String entrada) {
		for (int i = 0; i < TAM_CPF; i++) {
			this.entradaNumerica[i] = Integer.parseInt(String.valueOf(entrada.charAt(i)));
		}
	}
	
	public int getTamanho() {
		return entradaNumerica.length;
	}

	@Override
	public String toString() {
		return entrada.substring(0, 3) + "." + entrada.substring(3, 6) + "." 
				+ entrada.substring(6, 9) + "-" + entrada.substring(9, 11);
	}
		
}
