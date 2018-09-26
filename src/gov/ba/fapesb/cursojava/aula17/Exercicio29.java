package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite o número:");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++){
			
			boolean primo = true;
			for (int j = 2; j < i; j++){
				if (i % j == 0){
					//System.out.println(n + " não é primo.");
					primo = false;
				}
			}
			if (primo){
				System.out.println(i + " é primo.");	
			}
		
			
		}
		
	}

}
