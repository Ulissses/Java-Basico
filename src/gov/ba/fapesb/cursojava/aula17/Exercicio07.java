package gov.ba.fapesb.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.00");

		System.out.println("Digite o número 01: ");
		double num01 = scan.nextDouble();
		System.out.println("Digite o número 02: ");
		double num02 = scan.nextDouble();
		System.out.println("Digite o número 03: ");
		double num03 = scan.nextDouble();
		System.out.println("Digite o número 04: ");
		double num04 = scan.nextDouble();
		System.out.println("Digite o número 05: ");
		double num05 = scan.nextDouble();
		
		if (num01 >= num02 && num01 >= num03 && num01 >= num04 && num01 >= num05){
			System.out.print("O maior é numero 01: " + casaDecimal.format(num01));
		} else if (num02 >= num01 && num02 >= num03 && num02 >= num04 && num02 >= num05) {
			System.out.print("O maior é numero 02: " + casaDecimal.format(num02));
		} else if (num03 >= num01 && num03 >= num02 && num03 >= num04 && num03 >= num05){
			System.out.print("O maior é numero 03: " + casaDecimal.format(num03));
		} else if (num04 >= num01 && num04 >= num02 && num04 >= num04 && num04 >= num05){
			System.out.print("O maior é numero 04: " + casaDecimal.format(num04));
		} else {
			System.out.print("O maior é numero 05: " + casaDecimal.format(num05));
		} 
	}

}
