package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite o primeiro n�mero:");
		int num1 = scan.nextInt();
			if ((num1 % 2) == 0){
				par++;
			} else {
				impar++;
			}
		System.out.println("Digite o segundo n�mero:");
		int num2 = scan.nextInt();
			if ((num2 % 2) == 0){
				par++;
			} else {
				impar++;
			}
		System.out.println("Digite o terceiro n�mero:");
		int num3 = scan.nextInt();
			if ((num3 % 2) == 0){
				par++;
			} else {
				impar++;
			}
		System.out.println("Digite o quarto n�mero:");
		int num4 = scan.nextInt();
			if ((num4 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o quinto n�mero:");
		int num5 = scan.nextInt();
			if ((num5 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o sexto n�mero:");
		int num6 = scan.nextInt();
			if ((num6 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o s�timo n�mero:");
		int num7 = scan.nextInt();
			if ((num7 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o oitavo n�mero:");
		int num8 = scan.nextInt();
			if ((num8 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o nono n�mero:");
		int num9 = scan.nextInt();
			if ((num9 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Digite o d�cimo n�mero:");
		int num10 = scan.nextInt();
			if ((num10 % 2) == 0){
				par++;
			} else {
				impar++;
			}		
		System.out.println("Total de n�meros pares:   " + par);	
		System.out.println("Total de n�meros impares: " + impar);	
			
	}
}

