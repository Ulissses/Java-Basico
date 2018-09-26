package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String entrada = scan.next();

		if (entrada.equalsIgnoreCase("a") || entrada.equalsIgnoreCase("e")
				|| entrada.equalsIgnoreCase("i") || entrada.equalsIgnoreCase("o")
				|| entrada.equalsIgnoreCase("u")){
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}

		/*switch(entrada){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
		}*/
	}

}
