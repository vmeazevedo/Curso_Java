/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author vinicius.azevedo
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DEMONSTRAÇÃO DA ESTRUTURA CONDICIONAL COMPOSTA
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int n3 = tec.nextInt();
        int i = 2020 - n3;
        System.out.println("Sua idade é " + i + " anos");
        if (i>=18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
    
}
