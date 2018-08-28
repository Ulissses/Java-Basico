package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double resulta = (72.2 * altura) - 58;
		System.out.println("O peso ideal é: " + resulta);

	}

}
