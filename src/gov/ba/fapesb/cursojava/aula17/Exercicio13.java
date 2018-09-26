package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int numero = scan.nextInt();
		System.out.println("Digite o expoente:");
		int expoente = scan.nextInt();
		
		int resultado = numero;
		
		for (int i = 1; i < expoente; i++){
			resultado = resultado * numero;
		}
		System.out.println(resultado);
	}

}
