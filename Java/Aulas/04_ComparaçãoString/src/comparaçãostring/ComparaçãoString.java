/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaçãostring;

/**
 *
 * @author vinicius.azevedo
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Vinícius";
        String nome2 = "Vinícius";
        String nome3 = new String("Vinícius");
        String res;
        String res2;
        res = (nome1==nome2)?"igual":"diferente";               //
        res2 = (nome1.equals(nome3))?"igual":"diferente";       // Verifico se o conteudo é igual ou não
        System.out.println("Res: " + res);
        System.out.println("Res2: " + res2);;
        
    }
    
}
