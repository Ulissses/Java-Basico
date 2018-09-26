package gov.ba.fapesb.cursojava.aula16;

public class aula16 {

	public static void main(String[] args) {

		int i = 1;
		int max = 10;
		
		System.out.println("Contando até 10:");
		
		while (i <= max) {

			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
		System.out.println(i);
		
		do {
			
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 13);
		
		System.out.println(i);
	}

}
