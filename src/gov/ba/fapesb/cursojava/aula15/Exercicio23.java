package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		double file = 4.90;
		double alcatra = 5.90;
		double picanha = 6.90;
		double fator = 0.90;
		double descontos = 0;
		double ptotal = 0;
		double tpagar = 0;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.println("Escolha a carne: F-File P-Picanha A-Alcatara");
		String carne = scan.next();
		char tipo = carne.charAt(0);
		
		System.out.println("Quantos quilos?");
		double quilos = scan.nextDouble();
		
		System.out.println("Escolha a forma de pagamento: C-Cartão D-Dinheiro");
		String pagmto = scan.next();
		char forma = pagmto.charAt(0);
		
		// Filé
		if (tipo == 70 || tipo == 102){ 
			
			if (quilos <= 5){
				//Cartão
				if (forma == 67 || forma == 99){ 
					descontos = file * 0.05;
					ptotal = file * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Filé");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0;
					ptotal = file * quilos;
					tpagar = ptotal;
					System.out.println("Tipo:   Filé");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
			} else if (quilos > 5){
				// Cartão
				if (forma == 67 || forma == 99){ 
					descontos = file * 0.05;
					ptotal = (file - fator) * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Filé");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
					
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0;
					ptotal = (file - fator) * quilos;
					tpagar = ptotal;
					System.out.println("Tipo:   Filé");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
								
			}
			
		//Picanha	
		} else if (tipo == 80 || tipo == 112){
		
			if (quilos <= 5){
				
				//Cartão
				if (forma == 67 || forma == 99){ 
					descontos = picanha * 0.05;
					ptotal = picanha * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Picanha");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0;
					ptotal = picanha * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Picanha");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
			} else if (quilos > 5){
				// Cartão
				if (forma == 67 || forma == 99){ 
					descontos = picanha * 0.05;
					ptotal = (picanha - fator) * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Picanha");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
					
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0.00;
					ptotal = (picanha - fator) * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Picanha");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
								
			}
		
		// Alcatra	
		} else if (tipo == 65 || tipo == 98){
			
			if (quilos <= 5){
				
				//Cartão
				if (forma == 67 || forma == 99){ 
					descontos = alcatra * 0.05;
					ptotal = alcatra * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Alcatra");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0.00;
					ptotal = alcatra * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Alcatra");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
			} else if (quilos > 5){
				// Cartão
				if (forma == 67 || forma == 99){ 
					descontos = alcatra * 0.05;
					ptotal = (alcatra - fator) * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Picanha");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Cartão");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
					
				// Dinheiro	
				} else if (forma == 68 || forma == 100){
					descontos = 0;
					ptotal = (alcatra - fator) * quilos;
					tpagar = ptotal - descontos;
					System.out.println("Tipo:   Alcatra");
					System.out.println("Peso:  " + casaDecimal.format(quilos) + "Kg");
					System.out.println("Total: R$" + casaDecimal.format(ptotal));
					System.out.println("Forma de pagamento: Dinheiro");
					System.out.println("Valor do desconto: R$" + casaDecimal.format(descontos));
					System.out.println("Valor a pagar: R$" + casaDecimal.format(tpagar));
				}
								
			}
			
			
		}
		
	}

}
