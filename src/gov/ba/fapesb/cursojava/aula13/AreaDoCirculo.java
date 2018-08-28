package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class AreaDoCirculo {
	public static void main(String[] args){
		
		double pi = 3.14;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o raio:");
		double raio = scan.nextDouble();
		System.out.println("centimetros");
		double area = (raio * raio) * pi;
		System.out.print("Isso dá: " + area);
		System.out.println(" centimetros quadrados");
	}

}
