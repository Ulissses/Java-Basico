package gov.ba.fapesb.cursojava.aula18;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		vetorA[0] = 7;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 66;
		vetorA[6] = 7;
		vetorA[7] = 58;
		vetorA[8] = 9;
		vetorA[9] = 14;
		
		vetorB[0] = 3;
		vetorB[1] = 6;
		vetorB[2] = 9;
		vetorB[3] = 5;
		vetorB[4] = 15;
		vetorB[5] = 17;
		vetorB[6] = 2;
		vetorB[7] = 24;
		vetorB[8] = 9;
		vetorB[9] = 21;
		
		for (int i = 0; i < vetorA.length; i++){
			
			if (vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
			
			System.out.println("Para A " + vetorA[i] + " B é " + vetorB[i] + " e C é " + vetorC[i]);
		}
		
		
		
	}

}
