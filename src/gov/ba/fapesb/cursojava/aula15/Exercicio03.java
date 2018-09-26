package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main (String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo (M-F):");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("f")){
			System.out.println("F- Feminino");
		} else if (letra.equalsIgnoreCase("m")){
			System.out.println("M- Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		
	}

}
