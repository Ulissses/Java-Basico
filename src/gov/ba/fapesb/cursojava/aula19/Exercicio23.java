package gov.ba.fapesb.cursojava.aula18;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// Preencher um vetor com n�s pares. Parar quando n� �mpar for digitado
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com um valor para a posi��o: " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 != 0){
				break;
			}
		}
		
	}

}
