package util;

public class Produtos {
	
	// Atributos em private para serem acessados pelo get set
	private String nome;
	private double pre�o;
	
	public Produtos(String nome, double pre�o) {
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	
	
}
