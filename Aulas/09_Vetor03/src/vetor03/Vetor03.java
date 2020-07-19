/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author vinicius.azevedo
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
              
        // FOR - PARA CADA
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);                     // Coloando o vetor em ordem
        for (double valor: v) {             // For igual ao do python, imprime o valor de cada item da lista
            System.out.print(valor + " ");
        }
    }
    
}
