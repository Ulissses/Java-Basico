package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = scan.nextInt();
		double soma = 0;
		
		for (int i = 1; i <= n; i++){
			
			soma += 1/i;
			
		}
		System.out.println("Soma = " + soma);
	}

}
