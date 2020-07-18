/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author vinicius.azevedo
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // WHILE
        int dd = 0;
        while (dd<10) {
            System.out.println("Pirueta " + dd);
            dd++;
        }
        
        // CONTINUE
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 5 || cc == 7) {
                continue;
            }    
            System.out.println("Cambalhota " + cc);
        
        // BREAK
        int bb = 0;
        while (bb<10) {
            bb++;
            if (bb == 2 || bb == 3 || bb == 4) {
                continue;
            }
            if (bb == 7) {
                break;
            }
            System.out.println("Mortal " + bb);
        }
            
        }
    }
    
}
