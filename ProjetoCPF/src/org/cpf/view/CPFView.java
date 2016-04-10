package org.cpf.view;

import javax.swing.JOptionPane;

import org.cpf.controller.CPFController;

public class CPFView {

	public static void main(String[] args) {
		String bufferCPF;
		Integer opcaoMenu;
		
		CPFController cpfController = new CPFController();
		
		while(true) {
			try {
				opcaoMenu = Integer.valueOf(JOptionPane.showInputDialog(null, "\n" + "MENU --- CPF" + "\n" +
					"1 - Ler nove dígitos, gerar os dígitos verificadores e escrever o CPF completo." + "\n" +
					"2 - Ler um CPF de 11 dígitos e verificar e informar se o CPF está correto ou não." + "\n" +
					"0 - Encerrar o programa." + "\n" +
					"----------" + "\n" + 
					"Opção: ", "MENU - Sistema CPF", JOptionPane.INFORMATION_MESSAGE));
				
			// quando clica em cancel, opcaoMenu = null
			} catch (NumberFormatException e) {
				opcaoMenu = 0;
			}
			
			switch(opcaoMenu) {
			case 1:
				bufferCPF = JOptionPane.showInputDialog(null, "Informe os 9 dígitos: ", "Criar CPF - Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(null, cpfController.criarCPF(bufferCPF), "Criar CPF - Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 2:
				bufferCPF = JOptionPane.showInputDialog(null, "Informe o CPF (apenas algarismos): ", "Checar CPF - Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(null, cpfController.checarCPF(bufferCPF), "Checar CPF - Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Encerrando programa.", "Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
				return;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Escolha uma das opções válidas.", "Sistema CPF", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
