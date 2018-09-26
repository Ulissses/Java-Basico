 package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor da hora: R$ ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantidade horas trabalhadas:");
		int horasTraba = scan.nextInt();
		
		double salaBruto = valorHora * horasTraba;
		int percentualIR = 0;
		
		if (salaBruto <= 900.00){
			percentualIR = 0;
		} else if (salaBruto > 900.00 && salaBruto <= 1500.00){
			percentualIR = 5;
		} else if (salaBruto > 1500.00 && salaBruto <= 2500.00){
			percentualIR = 10;
		} else if (salaBruto > 2500.00){
			percentualIR = 20;
		}
		
		double ir = (salaBruto / 100) * percentualIR;
		double inss = (salaBruto / 100) * 10;
		double sindicato = (salaBruto / 100) * 3;
		double fgts = (salaBruto / 100) * 11;
		double descontos = ir + inss + sindicato;
		double salaLiquido = salaBruto - descontos;
		System.out.println("Salário Bruto:  (" + casaDecimal.format(valorHora) + " + " + horasTraba + ")    : R$ " +  casaDecimal.format(salaBruto));
		System.out.println("(-) ir    (0%)       : R$  " +  casaDecimal.format(ir));
		System.out.println("(-) inss  (10%)      : R$ " +  casaDecimal.format(inss));
		System.out.println("FGTS      (11%)      : R$ " +  casaDecimal.format(fgts));
		System.out.println("Total de descontos   : R$ " +  casaDecimal.format(descontos));
		System.out.println("Salário Líquido      : R$ " +  casaDecimal.format(salaLiquido));
	}

}
