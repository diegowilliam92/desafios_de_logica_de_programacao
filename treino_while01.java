package javaCompleto23;

import java.util.Scanner;

public class treino_while01 {

	public static void main(String[] args) {
		// Programa para leitura de Senha (valida ou invalida).
		Scanner sc = new Scanner(System.in);
		int X; 
		System.out.println("INFORME A SENHA: ");
		X=sc.nextInt();
		
		while (X != 2002) {
			System.out.println("SENHA INVALIDA!");
			System.out.print("informe novamente a senha: ");
			X=sc.nextInt();
		}
			System.out.println("ACESSO PERMITIDO:");
			sc.close();
	}

}
