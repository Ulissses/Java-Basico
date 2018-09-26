package gov.ba.fapesb.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		DecimalFormat casaDecimal = new DecimalFormat("#,###,###");
		Scanner scan = new Scanner(System.in);

		double popA = 0;
		double popB = 1;
		double taxaA = 0;
		double taxaB = 0;
		int anos = 0;
		int i = 0;
		
		while (i < 1){
			
			System.out.println("Entre com a população de A");
			double popAInicial = scan.nextDouble();
			System.out.println("Entre com a população de B");
			double popBInicial = scan.nextDouble();
			
			if (popAInicial < 1000 || popBInicial < 1000) {
				System.out.println("População não pode ser inferior a 1000 habitantes");
			} else if (popAInicial > popBInicial){
				System.out.println("A população de A deve ser maior que a de B");			
			} else {
				popA = popAInicial;
				popB = popBInicial;
				i++;
			}
			
		}
		
		i = 0;
		while (i < 1){
			
			System.out.println("Entre com a taxa de A");
			double taxaEntradaA = scan.nextDouble();
			System.out.println("Entre com a taxa de B");
			double taxaEntradaB = scan.nextDouble();
			
			if (taxaEntradaA < 0 || taxaEntradaB < 0) {
				System.out.println("A taxa não pode ser inferior a 0");
			} else {
				taxaA = taxaEntradaA;
				taxaB = taxaEntradaB;
				i++;
			}
			
		}
		
		while (popA < popB){
			
			popA = popA + ((popA / 100) * taxaA);
			popB = popB + ((popB / 100) * taxaB);
			++anos;
		}
		
		
		System.out.println("A populaçao de A é " + casaDecimal.format(popA) + " e B é " + casaDecimal.format(popB));
		System.out.println("Em " + anos + " anos");
	}

}
