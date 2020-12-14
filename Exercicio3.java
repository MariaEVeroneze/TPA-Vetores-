import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 10; 
		int a[], i, cont, contPrimo= 0;
		
		a = new int[E];

		for(cont = 0; cont < E; cont++) {
			System.out.println("Insira o número para saber se ele é primo:");
			a[cont] = in.nextInt();

			for (i=1; i<=a[cont]; i++) {
                 if (a[cont] %i==0) {
				     contPrimo++;
			     }
			}
			
			
			if (a[cont] == 1) {
				System.out.println("O número "+a[cont]+" não é primo.");
			}else if (contPrimo>2) {
				System.out.println("O número não é primo.");
			} else {
				System.out.println("O número é primo!");
			}
			System.out.println("\n");
			
			contPrimo = 0;
		}
		in.close();

	}

}
