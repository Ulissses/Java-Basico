package gov.ba.fapesb.cursojava.aula18;

public class Ex29AeBgeraC {

	public static void main(String[] args) {
		// Os 10 valores de A entram no inicio de C, os 10 de B entram no fim de C
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];
		
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorA[8] = 9;
		vetorA[9] = 10;
		
		vetorB[0] = 11;
		vetorB[1] = 12;
		vetorB[2] = 13;
		vetorB[3] = 14;
		vetorB[4] = 15;
		vetorB[5] = 16;
		vetorB[6] = 17;
		vetorB[7] = 18;
		vetorB[8] = 19;
		vetorB[9] = 20;
		
		for (int i = 0; i < vetorA.length; i++){
			
			vetorC[i] = vetorA[i];
			System.out.println("Para A " + vetorA[i] + " C é " + vetorC[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++){
			
			vetorC[i+10] = vetorB[i];
			System.out.println("Para B " + vetorB[i] + " C é " + vetorC[i+10]);
		}
	}

}
