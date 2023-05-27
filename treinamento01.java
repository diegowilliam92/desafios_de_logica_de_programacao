package javaCompleto23;
import java.util.Scanner;
public class treinamento01 {

	public static void main(String[] args) {

// Exercicio do prof. Nelio Alves (Estrutura Condicional IF-ELSE).
// Fazer um programa para ler nº inteiros e identificar se o nº é positivo ou Negativo.	
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
// O usuario irá dentro desta porta de interação informar o numero a ser avaliao pelo sistema,
// diacordo com a estrutura condicional (if ou Else);
		
		System.out.println("INFORME NUMERO:  ");
		numero=sc.nextInt();
		
	if(numero > 0) {
		System.out.println("NUMERO INFORMADO POSITIVO");
	}
	else {
		System.out.println("NUMERO INFORMADO NEGATIVO");
	}
	sc.close();
	}
  
}
