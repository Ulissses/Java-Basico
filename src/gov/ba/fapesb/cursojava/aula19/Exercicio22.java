package gov.ba.fapesb.cursojava.aula18;

public class Exercicio22 {

	public static void main(String[] args) {

		// Quantidade de zeros e uns
		
		int qtd0 = 0;
		int qtd1 = 0;
		double perc1 = 0;
		double perc0 = 0;
		int[] vetorA = new int[10];

		System.out.println("Quantidade de zeros e uns");
		
		for (int i = 0; i < vetorA.length; i++){
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if (vetorA[i] == 0){
				qtd0++;
			} else{
				qtd1++;
			}
		}
		
		perc0 = (qtd0 * 100) / vetorA.length;
		perc1 = (qtd1 * 100) / vetorA.length;
		System.out.print("O vetor é: ");
		
		for (int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("O percentual de zero é: " + perc0 + "%");
		System.out.println("O percentual de um é: " + perc1 + "%");
	}

}
