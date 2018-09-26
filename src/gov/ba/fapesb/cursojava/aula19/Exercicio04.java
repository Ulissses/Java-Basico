package gov.ba.fapesb.cursojava.aula18;

import java.math.*;

public class Exercicio04 {

	public static void main(String[] args) {
		// B é a raiz quadrada de A
		
		double[] arrayA = new double[15];
		double[] arrayB = new double[15];
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
		arrayA[10] = 11;
		arrayA[11] = 12;
		arrayA[12] = 13;
		arrayA[13] = 14;
		arrayA[14] = 15;
		
		System.out.println("B é a raiz quadrada de A:");
		
		for (int i = 0; i < arrayA.length; i++){
			arrayB[i] = Math.sqrt(arrayA[i]);
			System.out.println("Para A " + arrayA[i] + " B é " + arrayB[i]);
		}
	}
}
