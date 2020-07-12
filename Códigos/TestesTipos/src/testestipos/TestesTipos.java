/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestipos;

/**
 *
 * @author vinicius.azevedo
 */
public class TestesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int idade = 30;
        //String valor = idade;
        //String valor = (String) idade;                Ambos os casos não funcionam no Java
        //String valor = Integer.toString(idade);         //É preciso converter a classe 
        //System.out.println(valor);
        
        //String valor = "30";
        //int idade = valor;
        //int idade = (int) valor;
        //int idade = Integer.parseInt(valor);
        //System.out.println(idade);
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(valor);
        
        
        
    }
    
}
