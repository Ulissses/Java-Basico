package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i < 1){
			System.out.println("Digite seu nome:");
			String nome = scan.next();
			int contaNome = nome.length();
			if (contaNome > 3){
				i++;
			}
		}
		
		i = 0;
		while (i < 1){
			System.out.println("Digite seu idade:");
			int idade = scan.nextInt();
			if (idade < 150){
				i++;
			}
		}
		
		i = 0;
		while (i < 1){
			System.out.println("Digite seu salario");
			double salario = scan.nextDouble();
			if (salario > 0 ){
				i++;
			}
		}
		
		i = 0;
		while (i < 1){
			System.out.println("Digite o sexo");
			String sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
				i++;
			}
		}
		
		i = 0;
		while (i < 1){
			System.out.println("Digite o estado civil (c-casado, s-solteiro, d-divorciado, v-viúvo)");
			String estado = scan.next();
			if (estado.equalsIgnoreCase("c") || estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("d") || estado.equalsIgnoreCase("v")){
				i++;
			}
		}
		
	}

}
