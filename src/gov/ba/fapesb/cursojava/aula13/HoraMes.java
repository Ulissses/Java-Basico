package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class HoraMes {

	public static void main(String[] args) {


		
		int horasMes = 176;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o salário e numero de horas trabalhadas:");
		double salaMes = scan.nextDouble();
		int horasTrab = scan.nextInt();
		
		double salaHora = (salaMes / horasMes);
		double calcMes = (salaHora * horasTrab);

		System.out.println("Teu salário/hora é: R$ " + salaHora + " por hora");
		System.out.println("Voce trabalhou: " + horasTrab + "h");
		System.out.print("Isso dá: R$ " + calcMes);

	}

}
