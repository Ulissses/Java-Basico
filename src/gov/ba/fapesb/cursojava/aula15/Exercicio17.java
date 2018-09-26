package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano:");
		int ano = scan.nextInt();
		
	
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
				System.out.println("O ano é Bissexto");
		} else  {
			System.out.println("O ano não é Bissexto");
		}
		
	}

}
