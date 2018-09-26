package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de turmas");
		int turmas = scan.nextInt();
		
		int soma = 0;
		int media;
		int qtdalunos;
			
		for (int i=0; i < turmas; i++){
			
			System.out.println("Entre com a qtd de alunos da turma " + (i+1));
			qtdalunos = scan.nextInt();
			soma += qtdalunos;
		}
		media = soma / turmas;
		System.out.println("A média de alunos por turma é; " + media);

	}

}
