/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author vinicius.azevedo
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale locale = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(locale.getDisplayLanguage());
        
        
    }
    
}
