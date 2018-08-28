package gov.ba.fapesb.cursojava.aula13;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args){
		
		int resultado;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite seu primeiro e o segundo números:");
		int primeiro = scan.nextInt();
		int segundo = scan.nextInt();
		resultado = primeiro + segundo;
		System.out.println("O resultado é: " + resultado);
		
	}

}
