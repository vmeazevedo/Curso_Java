import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String vet_nome[] = new String[n];
		double vet_compra[] = new double[n];
		double vet_venda[] = new double[n];
		
		// criando a massa nos vetores
		for (int i=0; i<n; i++) {
			String x = sc.next();
			vet_nome[i] = x;
			double y = sc.nextDouble();
			vet_compra[i] = y;
			double z = sc.nextDouble();
			vet_venda[i] = z;
		}
		
		// criando um vetor de lucro
		double vet_lucro[] = new double[n];
		for (int i=0; i<n; i++) {
			vet_lucro[i] = vet_venda[i] - vet_compra[i];
		}
		
		// verificando se o lucro está ,<10, entre, ou >20
		int ct_10 = 0;
		int ct_1020 = 0;
		int ct_20 = 0;
		for (int i=0; i<n; i++) {
			if (vet_lucro[i] < (vet_compra[i] / 10.0)) {
				ct_10 += 1;
			}
			else if (vet_lucro[i] == (vet_compra[i] / 10.0)) {
				ct_1020 += 1;
			}
			else {
				ct_20 += 1;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + ct_10);
		System.out.println("Lucro entre 10% e 20%: " + ct_1020);
		System.out.println("Lucro acima de 20%: " + ct_20);
		
		// verificando a soma total de compra
		double soma1 = 0.0;
		for (int i=0; i<n; i++) {
			soma1 += vet_compra[i];
		}
		
		System.out.printf("Valor total de compra: %.2f%n", soma1);
		
		// verificando a soma total de venda
		double soma2 = 0.0;
		for (int i=0; i<n; i++) {
			soma2 += vet_venda[i];
		}
		
		System.out.printf("Valor total de venda: %.2f%n", soma2);
		
		// verificando a soma total de venda
		double lucro_total = 0.0;
		for (int i=0; i<n; i++) {
			lucro_total = soma2 - soma1;
		}
				
		System.out.printf("Valor total de compra: %.2f%n" , lucro_total);
		
		sc.close();

	}

}
