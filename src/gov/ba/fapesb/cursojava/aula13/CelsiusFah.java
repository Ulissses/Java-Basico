package gov.ba.fapesb.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusFah {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");

		System.out.println("Digite a temperatura em Celsius:");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura " + c + "°C equivale a " + casaDecimal.format(f) + "°f");

	}

}
