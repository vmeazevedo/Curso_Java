package exercicios_propostos3;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// Ex3: Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
		// um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
		// que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
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


