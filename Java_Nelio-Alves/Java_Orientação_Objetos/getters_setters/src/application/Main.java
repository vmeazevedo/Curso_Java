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
		System.out.print("Pre�o: ");
		double pre�o = sc.nextDouble();
		
		Produtos pd = new Produtos(nome, pre�o);
		
		System.out.println();
		System.out.println("Informa��es: ");
		System.out.println("Nome: " + nome);
		System.out.println("Pre�o: " + pre�o);
		
		// Atualizando os valores
		System.out.println("\nAtualizando o nome:");
		sc.nextLine();
		String novo_nome = sc.nextLine();
		
		System.out.println("Atualizando o pre�o:");
		double novo_pre�o = sc.nextDouble();
				
		// Apresentando os valores
		pd.setNome(novo_nome);
		System.out.println("\nNome atualizado: " + pd.getNome());
		
		pd.setPre�o(novo_pre�o);
		System.out.println("Pre�o atualizado: " + pd.getPre�o());
		
		
		
		sc.close();

	}

}
