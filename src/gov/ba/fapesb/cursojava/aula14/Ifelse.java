package gov.ba.fapesb.cursojava.aula14;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite a idade :");
		
		int idade = scan.nextInt();
		
		if (idade >= 18){
			
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
			
		}*/
		
		
		//Barato <= 10
		
		System.out.println("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10){
			
			System.out.println("Está barato, pode comprar");
			
		} else if (valor > 10 && valor < 15){
		
			System.out.println("Você pode pedir um desconto");
		} else if (valor >= 15 && valor < 17){
			
			System.out.println("Você pode pesquisar mais");
		} else {// valor >= 17
			
			System.out.println("Valor é muito caro");
		}
	}

}
