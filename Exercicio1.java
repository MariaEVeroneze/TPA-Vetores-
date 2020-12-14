import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 20;
		int i, a[], b[], par=0, impar=0; 
		
		a = new int [E];
		b = new int [E];
	
		for(i=0; i<E; i++) { 
				System.out.println("Digite o "+(i+1)+"º valor:");
				a[i] = in.nextInt();
				if (a[i] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
		}
			
		System.out.print("A = "); 
		for(i=0;i<E;i++) {
				System.out.print(a[i]+" ");
		}
		
		int contPar = 0;
		int contImpar = par;

		for(i=0; i<E; i++) {
				if (a[i]%2 == 0) {
				b[contPar] = a[i];
				contPar++;	
					b[contPar] = a[i];
					contPar++;	
				} else {
					b[contImpar] = a[i];
					contImpar++;
				}
		}

		for(i=0; i<E; i++) {
				if (a[i]%2 != 0) {
				b[contImpar] = a[i];
				contImpar++;
				}
		}

		System.out.println("\n");
		System.out.print("B = "); 
		for(i=0;i<E;i++) {
			System.out.print(b[i]+" ");
	}
	
	in.close();
	}

	}
