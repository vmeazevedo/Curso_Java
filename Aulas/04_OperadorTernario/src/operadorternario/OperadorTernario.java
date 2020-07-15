/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author vinicius.azevedo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2) ?0:1;               // Se o n1 for maior será apresentado 0, se não será apresentado 1.
        System.out.println(r);
    }
    
}
