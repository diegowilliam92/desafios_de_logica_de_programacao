package javaCompleto23;
import java.util.Scanner;
public class treinamento02 {

	public static void main(String[] args) {
//Programa para ler se um número inteiro par ou impar.
		
		Scanner sc= new Scanner (System.in);
		int numero,d1;
	
		System.out.println("INFORME O NUMERO: ");
		numero = sc.nextInt();
		d1 = (numero%2);
	if(d1==0) {
		System.out.println("o numero informado é PAR");
	}else {
		System.out.println("o numero informado é IMPAR");
	 }
	sc.close();
 }

}


