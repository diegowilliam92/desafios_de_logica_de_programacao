package javaCompleto23;

import java.util.Scanner;

public class treino_while02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int x,y;
		System.out.println("informe o valor de x: ");
		x=sc.nextInt();
		System.out.println("informe o valor de y: ");
		y=sc.nextInt();
		while (x !=0 && y !=0) {
			if(x>0 && y>0) {
				System.out.println("primeiro");
			}else if (x>0 && y<0) {
				System.out.println("quarto");
			}else if (x<0 && y<0) {
				System.out.println("terceiro");
			}else if (x<0 && y>0) {
				System.out.println("segundo");
			}
			System.out.println("informe o valor de x novamente: ");
			x=sc.nextInt();
			System.out.println("informe o valor de y novamente: ");
			y=sc.nextInt();	
			}
		sc.close();
		}
	
	}


