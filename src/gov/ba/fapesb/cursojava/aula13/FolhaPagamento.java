package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FolhaPagamento {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.##");
		DecimalFormat casaMil = new DecimalFormat("#,###.00");

		System.out.print("Digite o sal�rio/hora e n�mero de horas trabalhadas: ");
		double salHora = scan.nextDouble();
		int horTrabalhadas = scan.nextInt();
	
		double salBruto = (salHora * horTrabalhadas);
		double iRenda = (salBruto * 0.11);
		double inss = (salBruto * 0.08);
		double sind = (salBruto * 0.05);
		double descontos = iRenda + inss + sind;
		double salLiquido = salBruto - descontos;

		System.out.println("Sal�rio Bruto: R$" + casaMil.format(salBruto) + " - IR (11%): R$" + casaDecimal.format(iRenda) + " - INSS (8%): R$" + casaDecimal.format(inss) + " - Sindicato (5%): R$" + casaDecimal.format(sind) + " = Sal�rio L�quido: R$" + casaMil.format(salLiquido));
		System.out.println("OBS: Sal�rio Bruto: R$" + casaMil.format(salBruto) + " - Descontos: R$" + casaDecimal.format(descontos) + " = Sal�rio L�quido: R$" + casaMil.format(salLiquido));
	}

}
