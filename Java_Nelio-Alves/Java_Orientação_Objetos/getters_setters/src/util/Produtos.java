package util;

public class Produtos {
	
	// Atributos em private para serem acessados pelo get set
	private String nome;
	private double preço;
	
	public Produtos(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
	
}
