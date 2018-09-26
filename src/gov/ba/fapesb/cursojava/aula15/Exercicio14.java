package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Digite a primeira nota:");
		double nota01 = scan.nextDouble();
		System.out.println("Digite a primeira nota:");		
		double nota02 = scan.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		String aproveitamento = "";		
		
		if (media >= 9 && media <= 10){
		   aproveitamento = "A";
		} else if (media >= 7.5 && media < 9){
			aproveitamento = "B";
		} else if (media >= 6 && media < 7.5){
			aproveitamento = "C";
		} else if (media >= 4 && media < 6){
			aproveitamento = "D";
		} else if (media >= 0 && media < 4){
			aproveitamento = "E";
		}
		
		System.out.print("Notas: " + casaDecimal.format(nota01));
		System.out.println(" " + casaDecimal.format(nota02));	
		System.out.println("Média: " + casaDecimal.format(media));
		System.out.println("aproveitamento: " + aproveitamento);
		
		switch (aproveitamento){
		case "A":
		case "B":
		case "C": System.out.println("APROVADO"); break;
		case "D":
		case "E": System.out.println("REPROVADO"); break;
		}
	}

}
