package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String output;
		
		System.out.println("Digite o número:");
		int n = scan.nextInt();
		
		output = "O fatorial de " + n + "\n";
		
		output += n + "! = ";
		int fatorial = 1;
		for (int i = n; i > 0; i--){
			fatorial *= i;
			output += i + " . ";
		}
		System.out.println(output);
	}

}
