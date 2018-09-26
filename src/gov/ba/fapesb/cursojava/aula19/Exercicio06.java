package gov.ba.fapesb.cursojava.aula18;

public class Exercicio06 {

	public static void main(String[] args) {
		// C é A + B

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[10];
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 5;
		arrayA[5] = 6;
		arrayA[6] = 7;
		arrayA[7] = 8;
		arrayA[8] = 9;
		arrayA[9] = 10;
		
		arrayB[0] = 6;
		arrayB[1] = 8;
		arrayB[2] = 10;
		arrayB[3] = 12;
		arrayB[4] = 14;
		arrayB[5] = 16;
		arrayB[6] = 18;
		arrayB[7] = 20;
		arrayB[8] = 22;
		arrayB[9] = 24;
		
		System.out.println("C é A + B:");
		
		for (int i = 0; i < arrayA.length; i++){
			arrayC[i] = arrayA[i] + arrayB[i];
			System.out.println("Para A " + arrayA[i] + " B é " + arrayB[i] + " e C é " + arrayC[i]);
		}
		
	}

}
