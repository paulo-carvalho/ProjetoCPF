package org.cpf.controller;

import org.cpf.model.CPF;

public class CPFController {
	private CPF cpf;
	private int somaX;
	private int somaY;
	
	public String criarCPF(String sufixo) {
		somaX = 0;
		somaY = 0;
		
		if(sufixo.length() != CPF.TAM_CPF-2)
			return "Sufixo de tamanho inválido. Tente outro valor.";
		
		cpf = new CPF(sufixo + "00");
		
		for(int i = CPF.TAM_CPF-1; i >= 2-1; i--) {
			if(i >= 2)
				somaX += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i));
			
			somaY += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i+1));
		}

		cpf.setEntradaNumericaAt(getDigitoVerificador(somaX), CPF.TAM_CPF-2);
		cpf.setEntradaNumericaAt(getDigitoVerificador(somaY), CPF.TAM_CPF-1);
		
		return cpf.toString();
	}
	
	public String checarCPF(String cadastroPF) {
		somaX = 0;
		somaY = 0;
		
		if(cadastroPF.length() != CPF.TAM_CPF)
			return "CPF de tamanho inválido. Tente outro valor.";
		
		cpf = new CPF(cadastroPF);
		
		for(int i = CPF.TAM_CPF-1; i >= 2-1; i--) {
			if(i >= 2)
				somaX += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i));
			
			somaY += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i+1));
		}
		
		if((getDigitoVerificador(somaX) == cpf.getEntradaNumericaAt(CPF.TAM_CPF - 2)) && (getDigitoVerificador(somaY) == cpf.getEntradaNumericaAt(CPF.TAM_CPF - 1)))
			return cpf.toString();
		
		return "CPF inválido.";
	}
	
	private int getDigitoVerificador(int soma) {
		int resto;
		
		resto = 11 - (soma % 11);
		if ((resto == 10) || (resto == 11))
			resto = 0;
			
		return resto;
	}
}
