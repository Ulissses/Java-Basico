package gov.ba.fapesb.cursojava.aula17;

public class loopfor {

	public static void main(String[] args) {


		for (int i = 0; i < 5; i++){
			System.out.println("i tem valor: " + i);
		}
		
		for (int i = 5; i > 0; i--){
			System.out.println("i tem valor: " + i);
		}
		
		for (int i=0, j=10;i<j;i++,j--){
			System.out.println("i = " + i + "; j = " + j);			
		}
		
		int i = 0;
		for ( ;i<10; ){
			System.out.println("Valor de i: " + i);
			i += 2;
			
		}
		
		for (int cont = 0; cont < 10; cont += 2){
			System.out.println("Valor de cont: " + cont);
		}
		
		int soma = 0;
		for (int o=1;o<5;soma += o++);
		System.out.println("Valor de soma: " + soma);
	}

}
