package javaCompleto23;
import java.util.Scanner;
public class treinamento04 {

	public static void main(String[] args) {
//verifique hora inicial e hora final de um jogo.
//calcule a duração do jogo? (D.min 1H ; D.max 24H).
		
		Scanner sc= new Scanner (System.in);
		int Hora_inicial,Hora_final,duracao;
	
//Espaço de aquisição de inormação com usuario referente horarios.
		System.out.println("Informe a hora inicial: ");
		Hora_inicial=sc.nextInt();
		System.out.println("Informe a hora final: ");
		Hora_final=sc.nextInt();
		duracao= Hora_final-Hora_inicial;
		
//Espaço para as condicionais do tempo.
	if(Hora_inicial<Hora_final) {
		System.out.println("O jogo durou exatamente: "+ duracao);
	}else {
		System.out.println("O jogo durou: "+ (24-Hora_inicial+Hora_final));
	}
	sc.close();
	}

}
