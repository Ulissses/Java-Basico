package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class DobroAreaQuad {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		int lado = scan.nextInt();
		System.out.println("centimetros");
		int area = (lado * lado);
		int dobro = (area * area);
		System.out.print("Isso dá: " + area);
		System.out.println(" centimetros quadrados");
		System.out.print("Dobrando dá: " + dobro);
		System.out.println(" centimetros quadrados");

	}

}
