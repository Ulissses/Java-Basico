package gov.ba.fapesb.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		System.out.println("Entre com o limite");
		int maximo = scan.nextInt();
		
		for (int i = num; i <= maximo; i++) {
			System.out.println(i);
			if (i % 7 == 0){
				System.out.println("O valor de i é: " + i);
				break;
			}
		}
	}

}
