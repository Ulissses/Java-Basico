package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos");
		int alunos = scan.nextInt();
		
		int soma = 0;
		int media;
		int idade;
		
		
		for (int i=0; i < alunos; i++){
			
			System.out.println("Entre com a idade " + (i+1));
			idade = scan.nextInt();
			soma += idade;
		}
		
		media = soma / alunos;

		if ( media >= 0 && media <= 26 ) {
			System.out.println("Esta turma é jovem");
		} else if (media > 26 && media <= 60 ) {
			System.out.println("Esta turma é adulta");
		} else {
			System.out.println("Esta turma é idosa");
		}
	}

}
