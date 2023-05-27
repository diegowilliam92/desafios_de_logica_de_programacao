package javaCompleto23;
import java.util.Scanner;
public class treinamento05 {

	public static void main(String[] args) {
/* cod.1 = Cachorro Quente - R$4,00.
 * cod.2 = X-Salada - R$ 4,50.
 * cod.3 = X-Baicon - R$ 5,00.
 * cod.4 = Torrada Simples - 2,00.
 * cod.5 = Refrigerante - R$ 1,50.
 * -------------------------------
 * defina o valor total da compra informando quantidade,variedade e preço.
 */
		Scanner sc =new Scanner(System.in);
		int codigo,quant;
		double v1,v2,v3,v4,v5;
		
		v1=4.00;
		v2=4.50;
		v3=5.00;
		v4=2.00;
		v5=1.50;
		
	System.out.println("Informe o codigo do produto: ");
	codigo=sc.nextInt();
	System.out.println("Informe a quantidade do pedido: ");
	quant=sc.nextInt();
	
	if(codigo==1){
	    System.out.println("O valor do seu pedido e: R$"+ (quant*v1));
	}else if (codigo==2) {
	    System.out.println("O valor do seu pedido e: R$"+ (quant*v2));
	}else if (codigo==3) {
		System.out.println("O valor do seu pedido e: R$"+ (quant*v3));
	}else if (codigo==4) {
		System.out.println("O valor do seu pedido e: R$"+ (quant*v4));
	}else if (codigo==5){
		System.out.println("O valor do seu pedido e: R$"+ (quant*v5));
	}else {
		System.out.println("PEDIDO INDISPONIVEL");
	}
	sc.close();
}
	
}
