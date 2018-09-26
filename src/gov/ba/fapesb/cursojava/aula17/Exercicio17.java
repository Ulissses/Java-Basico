package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		

		System.out.println("Digite o número:");
		int n = scan.nextInt();

		int fatorial = 1;
		for (int i = n; i > 0; i--){
			fatorial *= i;
			System.out.print(i + ", ");
		}
		System.out.println("Resultado: " + fatorial);
	}

}
