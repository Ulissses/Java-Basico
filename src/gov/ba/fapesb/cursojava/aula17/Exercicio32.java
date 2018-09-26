package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod, qtd;
		int total = 0;
		String output = "";
		
		do {
			
			System.out.println("Digite o código e a quantidade do produto. Digite 0 0 para sair");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if (cod == 0 && qtd == 0){
				naoTerminar = false;
				output += "Total a pagar = R$ " + total;
			} else {
				if (cod == 100){
					output += "Cachorro-quente -> R$ 1,20 * " + qtd ;
					output += " = " + (1.20 * qtd) + "\n";
					total += (1.20 * qtd);
				} else if (cod == 101){
					output += "Bauru Simples -> R$ 1,30 * " + qtd ;
					output += " = " + (1.30 * qtd) + "\n";
					total += (1.30 * qtd);
				} else if (cod == 102){
					output += "Bauru com ovo -> R$ 1,50 * " + qtd ;
					output += " = " + (1.50 * qtd) + "\n";
					total += (1.50 * qtd);
				} else if (cod == 103){
					output += "Hamburguer -> R$ 1,20 * " + qtd ;
					output += " = " + (1.20 * qtd) + "\n";
					total += (1.20 * qtd);
				} else if (cod == 104){
					output += "Cheesebuger -> R$ 1,30 * " + qtd ;
					output += " = " + (1.30 * qtd) + "\n";
					total += (1.30 * qtd);
				} else if (cod == 105){
					output += "Refrigerante -> R$ 1,00 * " + qtd ;
					output += " = " + (1.00 * qtd) + "\n";
					total += (1.00 * qtd);
				}
	
			}
			
		} while(naoTerminar);

		System.out.println(output);
	}
	
}
