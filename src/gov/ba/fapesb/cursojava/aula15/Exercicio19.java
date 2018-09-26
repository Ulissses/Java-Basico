package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		double resultado = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número:");
		double num01 = scan.nextDouble();
		System.out.println("Digite outro número:");
		double num02 = scan.nextDouble();
		System.out.println("Escolha uma operação: (+ - * /)");
		
		String escolha = scan.next();
		boolean valida = true;
			
		switch (escolha){
		case "+": resultado = num01 + num02; break;
		case "*": resultado = num01 * num02; break;
		case "/": resultado = num01 / num02; break;
		case "-": resultado = num01 - num02; break;
		default: System.out.println("Opção inválida");
				valida = false;
		}
		
		if (valida){
			
				System.out.println("O resultado " + resultado);
				
				if (resultado >= 0){
					System.out.println("O resultado é positivo");
				} else {
					System.out.println("O resultado é negativo");	
				} 
				
				if (resultado % 2 == 0){
					System.out.print("O resultado é par");
				} else {
					System.out.print("O resultado é impar");
				}
		}

	}

}
