package org.cpf.controller;

import org.cpf.model.CPF;

public class CPFController {
	private CPF cpf;
	
	public String criarCPF(String sufixo) {
		cpf = new CPF(sufixo + "00");
		
		return null;
	}
	
	public String checarCPF(String cadastroPF) {
		int somaX = 0,
			somaY = 0,
			restoX = 0,
			restoY = 0;
		
		if(cadastroPF.length() != CPF.TAM_CPF)
			return "CPF de tamanho inválido. Tente outro valor.";
		
		cpf = new CPF(cadastroPF);
		
		for(int i = CPF.TAM_CPF-1; i >= 2-1; i--) {
			if(i >= 2)
				somaX += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i));
			
			somaY += (cpf.getEntradaNumericaAt((CPF.TAM_CPF-1) - i) * (i+1));
		}
		
		if(getDigitoVerificador(somaX, restoX, CPF.TAM_CPF - 1) && getDigitoVerificador(somaY, restoY, CPF.TAM_CPF))
			return cpf.toString();
		
		return "CPF inválido.";
	}
	
	private boolean getDigitoVerificador(int soma, int resto, int peso) {
		resto = 11 - (soma % 11);
		if ((resto == 10) || (resto == 11))
			resto = 0;
		if(resto != cpf.getEntradaNumericaAt(peso - 1))
			return false;
			
		return true;
	}
}
