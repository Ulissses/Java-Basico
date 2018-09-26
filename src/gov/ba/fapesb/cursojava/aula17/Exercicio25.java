package gov.ba.fapesb.cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;
		
		do {
			
			output = "Lojas Tabajara\n";
			
			System.out.println("Deseja informar um nova compra? S/N");
			continuarCompra = scan.next();
					
			total = 0;
			
			if (continuarCompra.equalsIgnoreCase("s") ){
				
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = scan.nextInt();
				
				for (int i = 1; i <= qtdProdutos; i++){
					System.out.println("Informe preço do produto " + i);
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				output += "Total: R$" + total + "\n";
				System.out.println("Total: R$" + total);
				System.out.println("Entre com o valor pago:");
				valorPago = scan.nextDouble();
				output += "Dinheiro: R$" + valorPago + "\n";
				troco = valorPago - total;
				output += "Troco: R$" + troco;
				
				System.out.println(output);
				
				
			} else {
				sair = true;
			}
			
		} while(!sair);
			
	}

}
