package javaCompleto23;

import java.util.Scanner;

public class treinamento03 {

	public static void main(String[] args) {
//Informar se os valores informados pelo usuario são multiplos!
//Dada duas variaveis..
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.println("Informe o primeiro numero: ");
		A=sc.nextInt();
		System.out.println("Informe o segundo numero: ");
		B=sc.nextInt();
		
	if(A%B==0 || B%A==0) {
		System.out.println("Numeros Multiplos: ");
	}else {
		System.out.println("Numeros NAO Multiplos: ");
	}
	sc.close();
	}

}
