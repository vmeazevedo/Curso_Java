package exercicios_propostos4;
import java.util.Scanner;
import java.util.Locale;
public class Main4 {

	public static void main(String[] args) {
		// Ex4: Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				// quantidade de notas inputadas sera 3
		double res=0;
		double res1=0;
		double res2=0;

		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			
			if (b==0) {
				System.out.println("divisao impossivel");
			}else {
				res = a/b;
				System.out.println(res);

			}
			if (d==0) {
				System.out.println("divisao impossivel");
			}else {
				res1 = c/d;
				System.out.println(res1);

			}
			if (f==0) {
				System.out.println("divisao impossivel");
			}else {
				res2 = e/f;
				System.out.println(res2);

			}


		}
		sc.close();
	}

}