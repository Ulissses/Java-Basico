package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota01 = scan.nextDouble();
		System.out.println("Digite a primeira nota:");		
		double nota02 = scan.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		if (media >= 7){
			System.out.println("Aprovado, m�dia: " + media);		
		} else if (media < 7){
			System.out.println("Reprovado, m�dia: " + media);		
		} else if (media == 10){
			System.out.println("Aprovado com distin��o, m�dia: " + media);		
		}
		
	}

}
