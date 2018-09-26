package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int resultado = 0;
		
		System.out.println("Digite um n�mero:");
		int num01 = scan.nextInt();
		System.out.println("Escolha uma opera��o: (+ - * /)");
		String escolha = scan.next();
		
		for (int i = 1; i <= 10; i++){
			
			switch (escolha){
			case "+": resultado = num01 + i; System.out.println(num01 + " + " + i + " = " + resultado); break;
			case "-": resultado = num01 - i; System.out.println(num01 + " - " + i + " = " + resultado); break;
			case "*": resultado = num01 * i; System.out.println(num01 + " * " + i + " = " + resultado); break;
			case "/": resultado = num01 / i; System.out.println(num01 + " / " + i + " = " + resultado); break;
			default: System.out.println("Opera��o inv�lida");
			}

		}
			
	}

}
