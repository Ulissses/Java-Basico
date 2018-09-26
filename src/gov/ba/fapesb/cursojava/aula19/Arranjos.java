package gov.ba.fapesb.cursojava.aula18;

public class Arranjos {

	public static void main(String[] args) {
		// Sintaxe e utilização do Array
		
		double[] temper = new double[365];
		temper[0] = 31.3;
		temper[1] = 32;
		temper[2] = 33.7;
		temper[3] = 34;
		temper[4] = 33.1;
		
		System.out.println("A temperatura do dia 3 é " + temper[2]);
		System.out.println("O tamanho do array é " + temper.length);
		System.out.println("O endereço do array é " + temper);
		
		/*for (int i = 0; i<= temper.length; i++){
			  System.out.println("A temperatura do dia " + (i+1) + " é " + temper[i]);
		  }*/	
		
		for (double temp : temper){
			System.out.println(temp);
		}
	}

}
