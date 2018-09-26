package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do pão");
		double preco = scan.nextDouble();
		

		System.out.println("Preço do pão: R$ " + preco);
		System.out.println("Panificadora Pão de ontem - tabela de preço");
		for (int i=1; i <= 50; i++){
			System.out.println( i + " - R$ " + (preco * i));
		}
	}

}
