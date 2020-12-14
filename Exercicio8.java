import java.util.Scanner; 
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], x;
		boolean analise = false; 
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"º elemento do vetor A: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("A[] = ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("Insira um número para verificar se ele está presente no vetor A: ");
		x = in.nextInt();
		
		for (i=0; i<TAM; i++) {
            if (a[i]==x){
                analise = true ;
            }
        }
		
		if (analise){
            System.out.println("O número "+x+" foi encontrado no vetor A!");
        }else{
            System.out.println("O número "+x+" não foi encontrado no vetor A.");
        }
		
		in.close();
	}
}


	


