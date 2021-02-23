import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String veta[] = new String[n];
		double vetb[] = new double[n];
		double vetc[] = new double[n];
		double vetm[] = new double[n];
		
		// salvando os valores nos vetores
		for (int i=0; i<n; i++) {
			String x = sc.next();
			veta[i] = x;
			double y = sc.nextDouble();
			vetb[i] = y;
			double z = sc.nextDouble();
			vetc[i] = z;
		}
		
		// criando o vetor da media
		for (int i=0; i<n; i++) {
			vetm[i] = (vetb[i] + vetc[i]) / 2;
		}
		
		System.out.println("Alunos aprovados:");
		// verificando quais alunos foram aprovados
		for (int i=0; i<n; i++) {
			if (vetm[i] >= 6.0) {
				System.out.println(veta[i]);
			}
		}
		
		
		sc.close();

	}

}
