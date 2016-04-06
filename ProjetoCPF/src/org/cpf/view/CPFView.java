package org.cpf.view;

import java.util.Scanner;

public class CPFView {

	public static void main(String[] args) {
		String bufferCPF;
		Integer opcaoMenu;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("MENU --- CPF" + "\n" +
				"1 - Ler nove dígitos, gerar os dígitos verificadores e escrever o CPF completo." + "\n" +
				"2 - Ler um CPF de 11 dígitos e verificar e informar se o CPF está correto ou não." + "\n" +
				"0 - Encerrar o programa." + "\n" +
				"----------");
		
		System.out.println("Opção: ");
		opcaoMenu = ler.nextInt();
		
		
	}

}
