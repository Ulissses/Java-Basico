package gov.ba.fapesb.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.00");

		double soma = 0;
		double media = 0;
		
		System.out.println("Digite o n�mero 01: ");
		double num01 = scan.nextDouble();
		System.out.println("Digite o n�mero 02: ");
		double num02 = scan.nextDouble();
		System.out.println("Digite o n�mero 03: ");
		double num03 = scan.nextDouble();
		System.out.println("Digite o n�mero 04: ");
		double num04 = scan.nextDouble();
		System.out.println("Digite o n�mero 05: ");
		double num05 = scan.nextDouble();
		
        soma = (num01 + num02 + num03 + num04 + num05);
        media = soma / 5;

        System.out.println("A soma �: " + casaDecimal.format(soma));
        System.out.println("A m�dia �: " + casaDecimal.format(media));
	}

}
