package exercicios_propostos4;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// Ex2: Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		// Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		// essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();						// informamos a quantidade de numero que iremos inputar
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();					// informamos o numero aqui a cada loop
			if(x>=10 && x<=20) {					// logica baseada no numero informado anteriormente
				in+=1;								// add no contador	
				
			}
			else {
				out+=1;
				
			}	
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();	
	}
}


