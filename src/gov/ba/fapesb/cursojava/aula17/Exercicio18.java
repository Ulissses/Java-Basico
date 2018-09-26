package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Digite o número:");
		int n = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				System.out.println(n + " não é primo.");
				primo = false;
			}
		}
		if (primo){
			System.out.println(n + " é primo.");	
		}
	}
}
