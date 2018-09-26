package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor:");
		int valor = scan.nextInt();

		
		if (valor >= 0){
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}

	}

}
