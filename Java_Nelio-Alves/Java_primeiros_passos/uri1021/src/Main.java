import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		double cem, resto, cinquenta, vinte,dez, cinco, dois, um;
		double c_50, c_25, c_10, c_5, c_1;
				
		valor = sc.nextDouble();
		
		//NOTAS
		cem = valor / 100;
		resto = valor % 100;
		
		cinquenta = resto / 50;
		resto = resto % 50;
				
		vinte = resto / 20;
		resto = resto % 20;
				
		dez = resto / 10;
		resto = resto % 10;
				
		cinco = resto / 5;
		resto = resto % 5;
				
		dois = resto / 2;
		resto = resto % 2;
		
		//MOEDAS
		um = resto / 1;
		resto = resto % 1;
		
		c_50 = resto / 0.5;
		resto = resto % 0.5;
		
		c_25 = resto / 0.25;
		resto = resto % 0.25;
		
		c_10 = resto / 0.10;
		resto = resto % 0.10;
		
		c_5 = resto / 0.05;
		resto = resto % 0.05;
		
		c_1 = resto / 0.01;
		resto = resto % 0.01;
		
		System.out.println("NOTAS:");
		System.out.println((int)cem + " nota(s) de R$ 100.00");
		System.out.println((int)cinquenta + " nota(s) de R$ 50.00");
		System.out.println((int)vinte + " nota(s) de R$ 20.00");
		System.out.println((int)dez + " nota(s) de R$ 10.00");
		System.out.println((int)cinco + " nota(s) de R$ 5.00");
		System.out.println((int)dois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int)um + " moeda(s) de R$ 1.00");
		System.out.println((int)c_50 + " moeda(s) de R$ 0.50");
		System.out.println((int)c_25 + " moeda(s) de R$ 0.25");
		System.out.println((int)c_10 + " moeda(s) de R$ 0.10");
		System.out.println((int)c_5 + " moeda(s) de R$ 0.05");
		System.out.println((int)c_1 + " moeda(s) de R$ 0.01");
		
		sc.close();

	}

}