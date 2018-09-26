package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Entre com a quantidade de morangos em (kg):");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de maças em (kg):");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdMorango <= 5){
			precoKgMorango = 2.50;
		} else {
			precoKgMorango = 2.20;
		}
		
		double precoKgMaca = 0;
		if (qtdMaca <= 5){
			precoKgMaca = 1.80;
		} else {
			precoKgMaca = 1.50;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Valor a pagar: R$ " + casaDecimal.format(precoTotal));
	}
}
