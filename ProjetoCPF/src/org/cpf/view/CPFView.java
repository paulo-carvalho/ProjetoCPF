package org.cpf.view;

import java.util.Scanner;

import org.cpf.controller.CPFController;

public class CPFView {

	public static void main(String[] args) {
		String bufferCPF;
		Integer opcaoMenu;
		Scanner ler = new Scanner(System.in);
		
		CPFController cpfController = new CPFController();
		
		while(true) {
			System.out.println("\n" + "MENU --- CPF" + "\n" +
					"1 - Ler nove dígitos, gerar os dígitos verificadores e escrever o CPF completo." + "\n" +
					"2 - Ler um CPF de 11 dígitos e verificar e informar se o CPF está correto ou não." + "\n" +
					"0 - Encerrar o programa." + "\n" +
					"----------");
			
			System.out.print("Opção: ");
			opcaoMenu = ler.nextInt();
			
			switch(opcaoMenu) {
			case 1:
				System.out.println("\n" + "Gerar CPF" + "\n");
				System.out.println("Informe os 9 dígitos: ");
				bufferCPF = ler.next();
				
				cpfController.criarCPF(bufferCPF);
				break;
				
			case 2:
				System.out.println("\n" + "Checar CPF" + "\n");
				System.out.print("Informe o CPF (apenas algarismos): ");
				bufferCPF = ler.next();
				
				System.out.println(cpfController.checarCPF(bufferCPF));
				break;
				
			case 0:
				System.out.println("Encerrando programa.");
				ler.close();
				return;
				
			default:
				System.out.println("Opção inválida. Escolha uma das opções abaixo." + "\n");
			}
		}
	}

}
