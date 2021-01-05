package string;

public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();						// todas as letras minusculas
		String s02 = original.toUpperCase();						// todas as letras maiusculas
		String s03 = original.trim();								// remove os espaços da string
		String s04 = original.substring(2);							// apresenta a partir do digito solicitado
		String s05 = original.substring(2, 9);						// apresenta a partir do digito solicitado e termina no digito solicitado
		String s06 = original.replace('a', 'x');					// troca um char
		String s07 = original.replace("abc", "xy");					// troca uma string
		int i = original.indexOf("bc");								// apresenta a primeira ocorrencia na string
		int j = original.lastIndexOf("bc");							// apresenta a ultima ocorrencia na string
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc','xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);	
	}

}
