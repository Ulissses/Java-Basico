package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class MediaDasNotas {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira, segunda, terceira e quarta notas8:");
		double nota01 = scan.nextDouble();
		double nota02 = scan.nextDouble();
		double nota03 = scan.nextDouble();
		double nota04 = scan.nextDouble();		
		
		double media = (nota01 + nota02 + nota03 + nota04)/4;
		
		System.out.println("O média é: " + media);
		
	}

}
