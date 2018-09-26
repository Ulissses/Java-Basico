package gov.ba.fapesb.cursojava.aula18;

public class Exercicio17 {

	public static void main(String[] args) {
		// O percentual de pares e ímpares
		

		
		int contIgual = 0;
		int[] arrayA = new int[10];
		arrayA[0] = 9;
		arrayA[1] = 20;
		arrayA[2] = 60;
		arrayA[3] = 55;
		arrayA[4] = 36;
		arrayA[5] = 15;
		arrayA[6] = 16;
		arrayA[7] = 21;
		arrayA[8] = 43;
		arrayA[9] = 27;
		
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] > 35){
				contIgual += 1;
			} 
		}
		System.out.println("Total de maiores de 35: " + contIgual);
	}

}
