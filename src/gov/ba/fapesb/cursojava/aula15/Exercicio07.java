package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		int num01 = scan.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int num02 = scan.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		int num03 = scan.nextInt();
		
		if (num01 <= num02 && num01 <= num03){
			System.out.println("O menor �: " + num01);
		} else if (num02 <= num01 && num02 <= num03) {
			System.out.println("O menor �: " + num02);
		} else if (num03 <= num01 && num03 <= num02){
			System.out.println("O menor �: " + num03);
		}
	}

}
