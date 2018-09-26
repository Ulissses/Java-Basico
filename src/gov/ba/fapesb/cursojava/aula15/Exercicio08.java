package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.00");

		System.out.println("Digite o preço do produto 01: ");
		double prod01 = scan.nextDouble();
		System.out.println("Digite o preço do produto 02: ");
		double prod02 = scan.nextDouble();
		System.out.println("Digite o preço do produto 03: ");
		double prod03 = scan.nextDouble();
		
		if (prod01 <= prod02 && prod01 <= prod03){
			System.out.print("Compre o produto 01 R$ " + casaDecimal.format(prod01));
		} else if (prod02 <= prod01 && prod02 <= prod03) {
			System.out.print("Compre o produto 02 R$ " + casaDecimal.format(prod02));
		} else if (prod03 <= prod01 && prod03 <= prod02){
			System.out.print("Compre o produto 03 R$ " + casaDecimal.format(prod03));
		} 
	}
}
