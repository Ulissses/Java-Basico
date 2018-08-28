package gov.ba.fapesb.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Throutput {

	public static void main(String[] args) {


		Scanner scann = new Scanner(System.in);
		DecimalFormat casaDecimal = new DecimalFormat("0.00");
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		double tamArquivo = scann.nextDouble();
		System.out.print("Digite a velocidade do Link em Mbps: ");
		double largBanda = scann.nextDouble();
		
		double tamArqConvertido = (tamArquivo * 8);
		double tempDownSegundos = tamArqConvertido / largBanda;
		double tempDownMinutos = (tempDownSegundos / 60);
		System.out.print("O tempo estimado é de: " + casaDecimal.format(tempDownMinutos) + " minutos");
	}

}
