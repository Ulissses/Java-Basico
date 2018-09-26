package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		

		if (numero % 2 == 0){
				System.out.print("O número " + numero);
				System.out.println("  é par");
		} else {
			System.out.print("O número " + numero);
			System.out.println("  é impar");	
		}
		
	}

}
