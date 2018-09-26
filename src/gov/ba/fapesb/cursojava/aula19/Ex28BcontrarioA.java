package gov.ba.fapesb.cursojava.aula18;

public class Ex28BcontrarioA {

	public static void main(String[] args) {
		// A gera B de trás para adiante
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
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
		
		for (int i = 0; i <vetorA.length; i++){
			vetorB[i] = (vetorA[vetorA.length - 1 - i]);
			System.out.println("Para A " + vetorA[i] + "   B é " + vetorB[i]);
			
		}
	}

}
