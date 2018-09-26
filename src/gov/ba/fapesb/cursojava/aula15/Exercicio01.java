package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		int num01 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int num02 = scan.nextInt();
		
		if (num01 > num02){
			System.out.println("O maior é: " + num01);
		} else {
			System.out.println("O maior é: " + num02);
		}
			
	}

}
