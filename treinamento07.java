package javaCompleto23;
import java.util.Locale;
import java.util.Scanner;
public class treinamento07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double x,y;
		// O usuario irá informar o valor de x;
		System.out.println("Informe o valor de x: ");
		x=sc.nextDouble();
		// O usuario irá informar o valor de y;
		System.out.println("Informe o valor de y: ");
		y=sc.nextDouble();
		// inicio do processamento da condicional;
		if(x>0 && y>0) {
			System.out.println("Q1");
		}else if (x<0 && y>0) {
			System.out.println("Q2");
		}else if (x<0 && y<0) {
			System.out.println("Q3");
		}else if (x>0 && y<0) {
			System.out.println("Q4");
		}else {
			System.out.println("origem");
		}
		sc.close();
	}

}
