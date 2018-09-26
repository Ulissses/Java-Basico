package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int inicio = 0;
		int fim = 0;
		int num01 = 0;	
		int num02 = 0;
		int i = 0;
		
		while (i < 1) {
			System.out.println("Digite o primeiro número:");
			num01 = scan.nextInt();
			System.out.println("Digite o segundo número:");
			num02 = scan.nextInt();
			if (num01 == num02) {
				System.out.println("Digite números diferentes:");				
			} else {
				++i;
			}
		}
			
		
		if (num02 < num01){
			fim = num01;
				for (inicio = num02; inicio < fim;){
					++inicio;
					System.out.print(inicio + " ");
				}
		} else if (num01 < num02){
				fim = num02;
				for ( inicio = num01; inicio < fim;){
					++inicio;
					System.out.print(inicio + " ");
				}
		}
	}
}
