package gov.ba.fapesb.cursojava.aula18;

public class Exercicio01 {

	public static void main(String[] args) {
		// Preenchendo array B com os elementos do array A
			
		int[] arrayB = new int[5];
		int[] arrayA = new int[5];
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 5;
		
		System.out.println("B é igual a A:");
		for (int i = 0; i < arrayA.length; i++){
			
			arrayB[i] = arrayA[i];
			System.out.println("Para A " + arrayA[i] + " B é " + arrayB[i]);
		}

	}

}
