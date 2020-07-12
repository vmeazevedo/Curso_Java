/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author vinicius.azevedo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ENTRADA DE DADOS
        Scanner teclado = new Scanner(System.in);                   //Inicializamos a entrada de dados do código
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();                           //Informamos que a nossa entrada de dados "teclado" vai receber uma string
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();                           //Informamos que a nossa entrada de dados "teclado" vai receber um float
        
        //SAÍDA DE DADOS
        System.out.println("A nota é: " + nota);                    //Printa a saída e pula uma linha
        System.out.printf("A nota de %s é %.2f \n", nome, nota);    //Formatando o nome e a nota com o %s e %f
        System.out.format("A nota de %s é %.2f \n", nome, nota);    //Mesmo utilidade que o printf
                
    
    }   
    
}
