package gov.ba.fapesb.cursojava.aula18;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorA = new int[10];
		char[] vetorB = new char[10];
		
		vetorA[0] = 2;
		vetorA[1] = 10;
		vetorA[2] = 3;
		vetorA[3] = 27;
		vetorA[4] = 8;
		vetorA[5] = 66;
		vetorA[6] = 7;
		vetorA[7] = 58;
		vetorA[8] = 9;
		vetorA[9] = 14;
		
		for (int i = 0; i < vetorA.length; i++){
			
			if (vetorA[i] < 7){
				vetorB[i] ='a';
			} else if (vetorA[i] == 7){
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10){
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else {
				vetorB[i] = 'e';	
			}
			
			System.out.println("Para A " + vetorA[i] + " B é " + vetorB[i]);
		}	
		
		
	}

}
