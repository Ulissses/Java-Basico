package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);		
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		System.out.println("Digite o número final da sequência:");
		int n = scan.nextInt();

		System.out.print(primeiro + ", ");
		System.out.print(segundo + ", ");
		for (int i = 3; i <= n; i++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + ", ");			
		}
		
	}

}
