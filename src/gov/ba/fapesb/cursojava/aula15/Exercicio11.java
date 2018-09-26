package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("#.00");


		System.out.println("Digite o salário: R$ ");
		double salario = scan.nextDouble();

		int percentual = 0;
		
		if (salario <= 280.00){
			percentual = 20;
		} else if (salario > 280.00 && salario <= 700.00){
			percentual = 15;
		} else if (salario >= 700.00 && salario < 1500.00){
			percentual = 10;
		} else if (salario >= 1500.00){
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("O salário/base é: R$ " + casaDecimal.format(salario));
		System.out.println("O percentual aplicado é: " + percentual + "%");
		System.out.println("O aumento foi de: R$ " + casaDecimal.format(aumento));
		System.out.println("O salário agora é: R$ " + casaDecimal.format(salarioAjustado));
		
	}

}
