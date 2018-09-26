package gov.ba.fapesb.cursojava.aula18;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];

		
		for (int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		boolean palindromo = true;
		for (int i = 0; i < (vetorA.length / 2); i++){
			
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		
		System.out.print("O vetor A :");
		for (int i = 0; i < vetorA[i]; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		if (palindromo){
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
		
	}

}
