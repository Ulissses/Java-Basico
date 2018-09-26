package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de CD´s");
		int colecao = scan.nextInt();
		
		int soma = 0;
		int media;
		int vlDiscos;
			
		for (int i=0; i < colecao; i++){
			
			System.out.println("Entre com o valor do disco " + (i+1));
			vlDiscos = scan.nextInt();
			soma += vlDiscos;
		}
		media = soma / colecao;
		System.out.println("O total gasto foi " + soma);
		System.out.println("O custo médio é " + media);
	}

}
