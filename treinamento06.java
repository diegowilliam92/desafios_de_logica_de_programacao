package javaCompleto23;

import java.util.Scanner;

public class treinamento06 {

	public static void main(String[] args) {
		/*
		 * Verificar os seguintes intervalos: 0,25 -> 25,50 -> 50,75 -> 75 ->100.
		 */
		Scanner sc = new Scanner(System.in);

		double A;
		System.out.printf("Informe o numero: ");
		A = sc.nextDouble();
		if (A >= 0.00 && A <= 25.00) {
			System.out.println("Numero no intervalo de 0 a 25!");
		} else if (A >= 25.00 && A <= 50.00) {
			System.out.println("Numero no intervalo de 25 a 50! ");
		} else if (A >= 50.00 && A <= 75.00) {
			System.out.println("Numero no intervalo de 50 a 75! ");
		} else if (A >= 75.00 && A <= 100.00) {
			System.out.println("Numero no intervalo de 75 a 100! ");
		} else {
			System.out.println("Fora dos intervalos estabelecidos!");
		}
		sc.close();
	}

}
