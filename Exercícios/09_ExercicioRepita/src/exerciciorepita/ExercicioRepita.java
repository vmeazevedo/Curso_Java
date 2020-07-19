/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author vinicius.azevedo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,s = 0;
        int p = 0;
        int i = 0;
        int cem = 0;
        int v = 0;
        int m = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (Pressione 0 para parar)"));
            s += n;
            v++;
            
            // PAR E IMPAR
            if (s%2==0){
                p++;
            } else {
                i++;
            }
            // ACIMA DE 100
            if (s>100) {
                cem++;
            } else {
                continue;
            }

            
        } while (n != 0);
            // MEDIA DOS VALORES
            m = s / (v-1);
            System.out.println(m);
            System.out.println(v);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Total de Valores: " + (v-1) + "<br>Total de Pares: " + (p-1) + "<br>Total de ímpares: " + (i) +
                "<br>Acima de 100: " + (cem) + "<br>Média dos valores: " + m + "</html>");
        
        
        
        
        
       //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas vindas", JOptionPane.WARNING_MESSAGE);   // Apresentando uma mensagem qualquer
       //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));                  // inputando valores em uma janela criada com JOption
       //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);                                   // Apresentando os valores digitados
       
    }
    
}
