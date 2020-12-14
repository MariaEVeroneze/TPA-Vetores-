import java.util.Scanner;
import java.lang.Math;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 11;
		int i;
		double a[];
		
		a = new double [TAM];
		
		for(i=0; i<TAM; i++) {
			a[i] = Math.pow(2, i);
		}
		
		System.out.print("A[] = ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+"  ");
		}
		in.close();

	}

}
