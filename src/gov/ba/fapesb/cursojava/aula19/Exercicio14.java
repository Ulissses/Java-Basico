package gov.ba.fapesb.cursojava.aula18;

public class Exercicio14 {

	public static void main(String[] args) {
		// A media dos valores ímpares de A
		
		int soma = 0;
		int media = 0;
		int qtd = 0;
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
		
		System.out.println("A media dos valores ímpares de A");
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] % 2 != 0){
			soma += arrayA[i];
			qtd++;
			}
			media = soma / qtd;
		}
		System.out.println("A média dos ímpares é: " + media);
	}

}
