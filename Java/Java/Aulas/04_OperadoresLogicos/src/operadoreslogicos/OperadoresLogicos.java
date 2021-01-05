/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author vinicius.azevedo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        boolean r1;
        boolean r2;
        r = (x<y && y<z) ?true:false;       // AND
        r1 = (x<y || y==z) ?true:false;      // OR
        r2 = (x<y ^ y<z) ?true:false;      // XOR
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }
    
}
