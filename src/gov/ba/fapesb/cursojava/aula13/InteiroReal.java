package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class InteiroReal {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro inteiro: ");
		int primeiro = scan.nextInt();
		System.out.println("Digite o segundo inteiro: ");
		int segundo = scan.nextInt();
		System.out.println("Digite o segundo real: ");
		double terceiro = scan.nextDouble();
		
		int resulta01 = (primeiro * 2) * (segundo / 2);
		double resulta02 = (primeiro * 3) + terceiro;
		double resulta03 = (terceiro * terceiro * terceiro);
		System.out.println("Dobro do primeiro x a metade do segundo: " + resulta01);
		System.out.println("Triplo do primeiro + o terceiro: " + resulta02);
		System.out.println("Terceiro ao cubo: " + resulta03);

	}

}
