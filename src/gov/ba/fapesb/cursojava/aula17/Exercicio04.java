package gov.ba.fapesb.cursojava.aula17;

import java.text.DecimalFormat;

public class Exercicio04 {

	public static void main(String[] args) {
		DecimalFormat casaDecimal = new DecimalFormat("#,###");

		double popuA = 80000;
		double popuB = 200000;
		int anos = 0;
		
		while (popuA < popuB){
				popuA = popuA * 1.03;
				popuB = popuB * 1.015;
				++anos;
				}
		System.out.println("A populaçao de A é " + casaDecimal.format(popuA) + " e B é " + casaDecimal.format(popuB));
		System.out.println("Em " + anos + " anos");				
	}

}
