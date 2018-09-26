package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Digite o primeiro lado:");
		double lado01 = scan.nextDouble();
		System.out.println("Digite o segundo lado:");		
		double lado02 = scan.nextDouble();
		System.out.println("Digite o terceiro lado:");		
		double lado03 = scan.nextDouble();
		
						
		if ((lado01 + lado02) > lado03) {
			if (lado01 == lado02 && lado02 == lado03){
				System.out.println("É um triangulo EQUILATERO");	
			} else if (lado01 == lado02 && lado02 != lado03){
				System.out.println("É um triangulo ISÓCELES");	
			} else if (lado01 != lado02 && lado02 != lado03 && lado01 != lado03){
				System.out.println("É um triangulo ESCALENO");	
			}
		} else {
			System.out.println("Não é um triangulo");	
		}
	}

}
