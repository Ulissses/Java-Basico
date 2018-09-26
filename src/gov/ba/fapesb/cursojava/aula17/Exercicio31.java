package gov.ba.fapesb.cursojava.aula17;

import java.text.DecimalFormat;


public class Exercicio31 {

	public static void main(String[] args) {

		DecimalFormat format = new DecimalFormat("###.###,##");
		double salario = 1000;
		double taxa = 1.5;
		
		salario += (salario / 100) * taxa;
		
		for (int i = 1997; i <= 2018; i++){
		
			taxa *= 2;
			salario += (salario / 100) * taxa;
	
			System.out.println(i + " = R$ " + format.format(salario) + " - " + format.format(taxa) + "%");
		}
		
	}

}
