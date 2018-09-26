package gov.ba.fapesb.cursojava.aula18;

public class Exercicio18 {

	public static void main(String[] args) {
		
		double menor = Double.MAX_VALUE ;
		double maior = Double.MIN_VALUE ;
		int posicaoMaior = 0;	
		int posicaoMenor = 0;

		int[] arrayA = new int[10];
		arrayA[0] = 9;
		arrayA[1] = 20;
		arrayA[2] = 60;
		arrayA[3] = 55;
		arrayA[4] = 36;
		arrayA[5] = 15;
		arrayA[6] = 16;
		arrayA[7] = 21;
		arrayA[8] = 43;
		arrayA[9] = 27;
		
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] > maior){
				maior = arrayA[i];
				posicaoMaior = i + 1;
			} 
			
			if (arrayA[i] < menor){
				menor = arrayA[i];
				posicaoMenor = i + 1;
			} 
			
		}
		System.out.println("A " + posicaoMaior + "ª é maior idade: " + maior);
		System.out.println("A " + posicaoMenor + "ª é menor idade: " + menor);
	}

}
