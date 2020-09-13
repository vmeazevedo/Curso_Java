package entities;		// pacote da classe

public class Triangle {		// nome da classe
	// atributos da classe
	public double a;			// o prefixo public significa que o atributo ou o metodo pode ser usado em outro arquivo
	public double b;
	public double c;
	
	// "double" é o tipo do dado que o metodo retorna (se o metodo nao retorna nada, usa-se a palavra void)
	public double area() {					// area é o nome do metodo, () é a lista de parametros
		double p = (a + b + c) / 2.0;		// corpo do metodo
		return Math.sqrt(p * (p - a) * ( p - b) * (p - c));
		
	}

}
