package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {


	int i = 0;
		while (i < 1 ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10:");
		int nota = scan.nextInt();
			if (nota > 10){
					System.out.println("Nota inválida");
			} else {
				i++;
				System.out.println("A nota digitada é: " + nota);			
			}
		}

	}

}
