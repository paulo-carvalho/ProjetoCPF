package org.cpf.view;

import java.util.Scanner;

public class CPFView {

	public static void main(String[] args) {
		String bufferCPF;
		Integer opcaoMenu;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("MENU --- CPF" + "\n" +
				"1 - Ler nove d�gitos, gerar os d�gitos verificadores e escrever o CPF completo." + "\n" +
				"2 - Ler um CPF de 11 d�gitos e verificar e informar se o CPF est� correto ou n�o." + "\n" +
				"0 - Encerrar o programa." + "\n" +
				"----------");
		
		System.out.println("Op��o: ");
		opcaoMenu = ler.nextInt();
		
		
	}

}
