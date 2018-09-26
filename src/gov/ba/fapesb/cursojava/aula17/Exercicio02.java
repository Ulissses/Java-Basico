package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o login:");
		String login = scan.next();
		int i = 0;
		while (i < 1 ) {
			System.out.println("Digite a senha:");
			String senha = scan.next();
			String senhaMinus = senha.toLowerCase();
			String loginMinus = login.toLowerCase();
			if (senhaMinus.contains(loginMinus)){
					System.out.println("senha inválida");
			} else {
				i++;
				System.out.println("Acesso permitido");			
			}
		}
	}

}
