package gov.ba.fapesb.cursojava.aula18;

public class Exercicio15 {

	public static void main(String[] args) {
		// O percentual de pares e ímpares
		
		double somaPar = 0;
		double somaImpar = 0;
		double percPar = 0;
		double percImpar = 0;
		int[] arrayA = new int[10];
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
		
		System.out.println("O percentual de pares e ímpares");
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] % 2 != 0){
				somaImpar += 1;
			} else {
				somaPar += 1;
			}
		}
		percPar = (somaPar / arrayA.length) * 100;
		percImpar = (somaImpar / arrayA.length) * 100;
		
		System.out.println("O percentual dos ímpares é: " + percImpar);
		System.out.println("O percentual dos pares é: " + percPar);
	}

}
