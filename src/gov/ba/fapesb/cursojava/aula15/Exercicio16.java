package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");

		
		System.out.println("Digite o valor de a:");
		double a = scan.nextDouble();
		
		if (a > 0){
			
			System.out.println("Digite o valor de b:");		
			double b = scan.nextDouble();
			System.out.println("Digite o valor de c:");		
			double c = scan.nextDouble();
		
			double delta = (b * b) - (4 * a * c);
			double xpos = (- b + Math.sqrt(delta)) / (2 * a);
			double xneg = (- b - Math.sqrt(delta)) / (2 * a);
			
			if (delta > 0){
				System.out.println("As raízes da equação são: x'  =  " + casaDecimal.format(xpos));
				System.out.println("                          x'' = " + casaDecimal.format(xneg));
			} else if (delta == 0){
					if (xpos != 0 && xneg == 0){
						System.out.print("Só possui uma raíz: x' = " + casaDecimal.format(xpos));
					} else if (xneg != 0 && xpos == 0){
						System.out.print("Só possui uma raíz: x'' = " + casaDecimal.format(xneg));
					} 
			} else if (delta < 0){
				System.out.println("Delta é negativo, logo a equação não possui raízes.");
			}
		}
	}
}


