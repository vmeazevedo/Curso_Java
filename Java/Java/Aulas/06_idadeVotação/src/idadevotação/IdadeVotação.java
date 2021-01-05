/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevotação;

import java.util.Scanner;

/**
 *
 * @author vinicius.azevedo
 */
public class IdadeVotação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o ano de seu nascimento: ");
        int ano = teclado.nextInt();
        
        int idade = 2020 - ano;
        System.out.print("A sua idade é: " + idade + " anos.");
        
        if (idade<16) {
            System.out.println("\nVocê ainda não vota.");
        } else {
            if ((idade>=16 && idade<=18) || (idade>70)) {
            System.out.println("\nSeu voto é opcional.");
          } else {
                System.out.println("\nSeu voto é obrigatório!");
            }
        }
    }
    
}
