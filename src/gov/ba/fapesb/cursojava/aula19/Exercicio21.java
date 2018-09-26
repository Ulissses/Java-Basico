package gov.ba.fapesb.cursojava.aula18;

public class Exercicio21 {

	public static void main(String[] args) {
		// Conversor de Moeda: Dollar x Real
		
		double dollar = 4.08;
		double[] nota01 = new double[20];

		System.out.println("Conversor de Moeda: Dollar x Real");
		
		for (int i = 0; i < 20; i++){
			nota01[i] = dollar * (i + 1);
			System.out.println("D$" + (i+1)  + " dolar = R$ " + nota01[i]);
		}
	}

}
