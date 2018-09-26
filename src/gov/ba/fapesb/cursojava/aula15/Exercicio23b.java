package gov.ba.fapesb.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23b {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
	  	
	  	System.out.println("Entre com o tipo da carne:");
	  	System.out.println("1 - file duplo");
	  	System.out.println("2 - alcatra");
	  	System.out.println("3 - picanha");
	  	int tipo = scan.nextInt();


	  	System.out.println("Entre com quantidade (Kg): ");
	  	double qtd = scan.nextDouble();
	  	
	  	double precoKg = 0;

	  	if ( tipo == 1 ){
	  		
	  		System.out.println(qtd + "Kg - filé duplo");
	  		if (qtd < 5){
	  	        precoKg = 4.90;		
	  		} else {
	  		    precoKg = 5.90;
	  		}

	  	} else if( tipo == 2 ) {

	  		System.out.println(qtd + "Kg - alcatra");		
	  		if (qtd < 5){
	  	        precoKg = 5.90;		
	  		} else {
	  		    precoKg = 6.80;
	  		}

	  	} else if( tipo == 3 ) {

	  		System.out.println(qtd + "Kg - picanha");
	  		if (qtd < 5){
	  	        precoKg = 6.90;		
	  		} else {
	  		    precoKg = 7.80;
	  		}
	  	}

	  	
	  	double total = qtd * precoKg;
	  	System.out.println(qtd + "Kg * R$" + casaDecimal.format(precoKg) + " = " + casaDecimal.format(total));

	  	System.out.println("Compra no cartão? digite 1 para sim");
	  	int cartao = scan.nextInt();
	  	
	  	if (cartao == 1){
	  		double desconto = (total / 100) * 5;
	  		System.out.println("Desconto de " + casaDecimal.format(desconto));
	  		System.out.println("Valor a pagar: R$ " + casaDecimal.format((total - desconto)));
	  	} else {
	  		System.out.println("Valor a pagar: R$ " + casaDecimal.format(total));
	  	}



    }

}