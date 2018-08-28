package gov.ba.fapesb.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fahrenheit2Cel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");

		System.out.println("Digite a temperatura em Fahrenheit:");
		double f = scan.nextDouble();
		
		double c = (5 * (f-32) /9);
		
		System.out.println("A temperatura " + f + "°f equivale a " + casaDecimal.format(c) + "°C");
	}

}
