package gov.ba.fapesb.cursojava.aula18;

public class Exercicio10 {

	public static void main(String[] args) {
		// B � A % 2
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
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
		
		System.out.println("B � A % 2:");
		
		for (int i = 0; i < arrayA.length; i++){
			arrayB[i] = arrayA[i] % 2;
			System.out.println("Para A " + arrayA[i] + " B � " + arrayB[i]);
		}
	}

}
