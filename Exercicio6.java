import java.util.Scanner; 
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 3; 
		int i, a[], b[], c[], j, x = 0, iguais=0;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º elemento de A:");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º elemento de B:");
			b[i] = in.nextInt();
		}
		
		
		System.out.print("A = "); 
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
		
		System.out.println("\n");
		
		System.out.print("B = "); 
			for(i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
			}
		
		System.out.println("\n");
		System.out.print("A ∩ B = "); 
		
		for(i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					iguais++;
				}
				
			}
		}
		
		if (iguais == 0) {
			System.out.println("Não há valores iguais, portanto o vetor C está vazio.");
		}else {
			for(i=0; i<TAM; i++) {
				for (j=0; j<TAM; j++) {
					if (a[i] == b[j]) {
						c[x] = a[i];
						System.out.print(c[x]+" ");
						x++;
					}
					
				}
			}
			
		}
		in.close();
	}
}

	


