package gov.ba.fapesb.cursojava.aula18;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
	
		
		for (int i = 0; i < vetorA.length; i++){
			
			System.out.println("Entre com o valor para a posicão: " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0){
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++){
			System.out.println("Para A " + vetorA[i] + " B é " + vetorB[i]);
		}		
		
	}

}
