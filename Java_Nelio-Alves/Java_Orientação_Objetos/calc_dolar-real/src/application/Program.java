package application;

import java.util.Locale;
import java.util.Scanner;

import util.conversorMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciando nossa classe utilitaria
		conversorMoeda conv = new conversorMoeda();
		
		
		System.out.print("What is the dollar price? ");
		conv.dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		conv.m_dollar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + conv);
		
		sc.close();
		
	}

}
