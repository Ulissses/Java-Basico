package gov.ba.fapesb.cursojava.aula18;

public class Exercicio09 {

	public static void main(String[] args) {
		// C é B / A
		
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
		
		arrayB[0] = 3;
		arrayB[1] = 6;
		arrayB[2] = 9;
		arrayB[3] = 12;
		arrayB[4] = 15;
		arrayB[5] = 17;
		arrayB[6] = 21;
		arrayB[7] = 24;
		arrayB[8] = 27;
		arrayB[9] = 30;
		
		System.out.println("C é B / A:");
		
		for (int i = 0; i < arrayA.length; i++){
			arrayC[i] = arrayB[i] / arrayA[i];
			System.out.println("Para A " + arrayA[i] + " B é " + arrayB[i] + " e C é " + arrayC[i]);
		}
	}

}
