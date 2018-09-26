package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.00");

		System.out.println("Digite o número 01: ");
		double num01 = scan.nextDouble();
		System.out.println("Digite o número 02: ");
		double num02 = scan.nextDouble();
		System.out.println("Digite o número 03: ");
		double num03 = scan.nextDouble();
		
		if (num01 <= num02 && num01 <= num03 && num02 <= num03){
			System.out.print(casaDecimal.format(num03) + " " + casaDecimal.format(num02) + " " + casaDecimal.format(num01));
		} else if (num01 <= num02 && num01 <= num03 && num03 <= num02) {
			System.out.print(casaDecimal.format(num03) + " " + casaDecimal.format(num01) + " " + casaDecimal.format(num02));
		} else if (num02 <= num01 && num02 <= num03 && num01 <= num03){
			System.out.print(casaDecimal.format(num01) + " " + casaDecimal.format(num02) + " " + casaDecimal.format(num03));
		} else if (num02 <= num01 && num02 <= num03 && num03 <= num01){
			System.out.print(casaDecimal.format(num01) + " " + casaDecimal.format(num03) + " " + casaDecimal.format(num02));
		} else if (num03 <= num01 && num03 <= num02 && num01 <= num02){
			System.out.print(casaDecimal.format(num02) + " " + casaDecimal.format(num01) + " " + casaDecimal.format(num03));
		} else if (num03 <= num01 && num03 <= num02 && num02 <= num01){
			System.out.print(casaDecimal.format(num02) + " " + casaDecimal.format(num01) + " " + casaDecimal.format(num03));
		} 
	}
}
