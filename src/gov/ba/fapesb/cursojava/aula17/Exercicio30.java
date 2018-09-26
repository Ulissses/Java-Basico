package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		int inicio;
		int termino;
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		System.out.println("Escolha uma operação: (+ - * /)");
		String escolha = scan.next();
		
		boolean invalido = false;
		
		do {
			
			System.out.println("Digite onde iniciar:");
			inicio = scan.nextInt();
			System.out.println("Digite onde termina:");
			termino = scan.nextInt();
			
			if (inicio > termino){
				
				invalido = true;
			}
			
		} while (!invalido);
		

		
		for (int i = inicio; i <= termino; i++){
			
			switch (escolha){
			case "+": resultado = numero + i; System.out.println(numero + " + " + i + " = " + resultado); break;
			case "-": resultado = numero - i; System.out.println(numero + " - " + i + " = " + resultado); break;
			case "*": resultado = numero * i; System.out.println(numero + " * " + i + " = " + resultado); break;
			case "/": resultado = numero / i; System.out.println(numero + " / " + i + " = " + resultado); break;
			default: System.out.println("Operação inválida");
			}

		}
	}
}
