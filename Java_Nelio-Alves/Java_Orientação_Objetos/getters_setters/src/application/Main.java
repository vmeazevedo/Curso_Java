package application;

import java.util.Locale;
import java.util.Scanner;

import util.Produtos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preço = sc.nextDouble();
		
		Produtos pd = new Produtos(nome, preço);
		
		System.out.println();
		System.out.println("Informações: ");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preço);
		
		// Atualizando os valores
		System.out.println("\nAtualizando o nome:");
		sc.nextLine();
		String novo_nome = sc.nextLine();
		
		System.out.println("Atualizando o preço:");
		double novo_preço = sc.nextDouble();
				
		// Apresentando os valores
		pd.setNome(novo_nome);
		System.out.println("\nNome atualizado: " + pd.getNome());
		
		pd.setPreço(novo_preço);
		System.out.println("Preço atualizado: " + pd.getPreço());
		
		
		
		sc.close();

	}

}
