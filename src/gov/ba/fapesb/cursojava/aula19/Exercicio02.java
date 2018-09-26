package gov.ba.fapesb.cursojava.aula18;

public class Exercicio02 {

	public static void main(String[] args) {
		// Array B recebe os valores do array A multiplicados pro 2
		
		int[] arrayB = new int[8];
		int[] arrayA = new int[8];
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 5;
		arrayA[5] = 6;
		arrayA[6] = 7;
		arrayA[7] = 8;
		
		System.out.println("B é o dobro de A:");
		for (int i = 0; i < arrayA.length; i++){
						arrayB[i] = arrayA[i] * 2;
			System.out.println("Para A " + arrayA[i] + " B é " + arrayB[i]);
		}
	}

}
