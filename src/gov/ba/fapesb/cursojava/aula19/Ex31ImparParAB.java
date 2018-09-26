package gov.ba.fapesb.cursojava.aula18;

public class Ex31ImparParAB {

	public static void main(String[] args) {
		// B armazena ímpares e pares de A em separados

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		
		int posB = 0;
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
		vetorA[10] = 11;
		vetorA[11] = 12;
		vetorA[12] = 13;
		vetorA[13] = 14;
		vetorA[14] = 15;
		vetorA[15] = 16;
		vetorA[16] = 17;
		vetorA[17] = 18;
		vetorA[18] = 19;
		vetorA[19] = 20;
		
		for (int i = 0; i < vetorA.length; i++){
			
			if (vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++){
			
			if (vetorA[i] % 2 != 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}

		System.out.print("O vetor A : ");		
		for (int i = 0; i < vetorA.length; i++){
				System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("O vetor B : ");		
		for (int i = 0; i < vetorA.length; i++){
				System.out.print(vetorB[i] + " ");
		}
		
	}

}
