package exercicios_propostos3;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// Ex3: Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		// exemplo.
		
		Scanner sc = new Scanner(System.in);
	
		int selecao = sc.nextInt();
		int ca = 0;
		int cg = 0;
		int cd = 0;
		
		while (selecao != 4) {
			if (selecao ==1 ) {
				ca+=1;
		    }
			else if (selecao == 2) {
				cg += 1;
		    }
			else if (selecao == 3) {
				cd +=1;
						
			}
			selecao = sc.nextInt();
		}
				
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + ca);
		System.out.println("Gasolina: " + cg);
		System.out.println("Diesel: " + cd);
		sc.close();
		}
	}


