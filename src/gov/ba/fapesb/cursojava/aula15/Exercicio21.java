package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Escolha o combustivel: (G - A)");
		String tipo = scan.next();
		
		System.out.println("Quantos litros?");
		double litros = scan.nextDouble();
		
		double gasolina = 2.50;
		double alcool = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totDesconto = 0;
		
		if (tipo.equalsIgnoreCase("a")){

			if (litros <= 20){
				percDesconto = 3;
			} else if (litros > 20){
				percDesconto = 5;
			}
			
			total = litros * alcool;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20){
				percDesconto = 4;
			} else if (litros > 20){
				percDesconto = 6;
			}
			
			total = litros * gasolina;	
		}
		

		totDesconto = (total / 100) * percDesconto;
		double valorPagar = (total - totDesconto);
		System.out.println("Total a pagar: R$ " + casaDecimal.format(valorPagar));
					
	}

}
