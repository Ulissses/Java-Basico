package gov.ba.fapesb.cursojava.aula18;

public class Exercicio16 {

	public static void main(String[] args) {
		// O percentual de pares e ímpares
		
		double somaMenor = 0;
		double contIgual = 0;
		double somaMaior = 0;
		double contMaior = 0;
		double media = 0;
		int[] arrayA = new int[10];
		arrayA[0] = 9;
		arrayA[1] = 20;
		arrayA[2] = 60;
		arrayA[3] = 110;
		arrayA[4] = 5;
		arrayA[5] = 15;
		arrayA[6] = 16;
		arrayA[7] = 21;
		arrayA[8] = 98;
		arrayA[9] = 101;
		
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] < 15){
				somaMenor += arrayA[i];
			} else if (arrayA[i] == 15){
				contIgual += 1;
			} else {
				somaMaior += arrayA[i];
				contMaior += 1;
			}
			media = somaMaior / contMaior;
		}
		
		System.out.println("A soma dos menores de 15 é: " + somaMenor);
		System.out.println("O valores iguais a 15 são: " + contIgual);
		System.out.println("A média dos maiores que 15 é : " + media);
		
	}

}
