package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do p�o");
		double preco = scan.nextDouble();
		

		System.out.println("Pre�o do p�o: R$ " + preco);
		System.out.println("Panificadora P�o de ontem - tabela de pre�o");
		for (int i=1; i <= 50; i++){
			System.out.println( i + " - R$ " + (preco * i));
		}
	}

}
