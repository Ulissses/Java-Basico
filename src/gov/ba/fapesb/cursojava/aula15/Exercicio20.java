package gov.ba.fapesb.cursojava.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		int contagem = 0;		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima?");
		String resp01 = scan.next();

		System.out.println("Resposta 01:" + resp01);
		
		System.out.println("Esteve no local do crime?");
		String resp02 = scan.next();
		
		System.out.println("Resposta 01: " + resp01 + " 02: " + resp02);

		System.out.println("Mora perto da v�tima?");
		String resp03 = scan.next();
		
		System.out.println("Respostas 01,02 e 03 : " + resp01 + " " + resp02 + " " + resp03);

		System.out.println("Devia para a v�tima?");
		String resp04 = scan.next();
		
		System.out.println("Respostas 01: " + resp01 + " 02: " + resp02 + " 03:"
		+ resp03 + " 04: " + resp04);

		System.out.println("J� trabalhou com a v�tima?");
		String resp05 = scan.next();

		System.out.println("Respostas 01: " + resp01 + " 02: " + resp02 + " 03: "
		+ resp03 + " 04: " + resp04 + " 05: " + resp05);
		
		if (resp01.equalsIgnoreCase("s")){
			++contagem;
		}
		
		if (resp02.equalsIgnoreCase("s")){
			++contagem;
		}
		
		if (resp03.equalsIgnoreCase("s")){
			++contagem;
		} 
		
		if (resp04.equalsIgnoreCase("s")){
			++contagem;
		}
		
		if (resp05.equalsIgnoreCase("s")){
			++contagem;
		}
		
		if (contagem == 2){
			System.out.println("SUSPEITO");
		} else if (contagem == 3 || contagem == 4){
			System.out.println("CUMPLICE");
		} else if (contagem == 5){
			System.out.println("ASSASSINO");
		} else if (contagem == 5){
			System.out.println("INOCENTE");
		}
		
	}

}
