package gov.ba.fapesb.cursojava.aula18;

public class Exercicio19 {

	public static void main(String[] args) {

		// C é A + B
		
		double media = 0;
		String conceito = "";
		int[] nota01 = new int[10];
		int[] nota02 = new int[10];
		double[] result = new double[10];
		nota01[0] = 8;
		nota01[1] = 5;
		nota01[2] = 3;
		nota01[3] = 4;
		nota01[4] = 5;
		nota01[5] = 6;
		nota01[6] = 7;
		nota01[7] = 8;
		nota01[8] = 9;
		nota01[9] = 9;
		
		nota02[0] = 6;
		nota02[1] = 8;
		nota02[2] = 6;
		nota02[3] = 9;
		nota02[4] = 7;
		nota02[5] = 5;
		nota02[6] = 4;
		nota02[7] = 8;
		nota02[8] = 9;
		nota02[9] = 5;
		
		System.out.println("C é A + B:");
		
		for (int i = 0; i < nota01.length; i++){
			media = nota01[i] + nota02[i];
			result[i] = media / 2;
			if (result[i] >= 7){
				conceito = "APROVADO";
			} else {
				conceito = "REPROVADO";
			}
			
			System.out.println("Nota A " + nota01[i] + " a nota B é " + nota02[i] + ", o resultado é " + result[i] + ": " + conceito);
		}
	}

}
