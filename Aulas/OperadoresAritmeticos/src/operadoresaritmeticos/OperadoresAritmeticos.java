/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author vinicius.azevedo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMETICOS
        int n1 = 5;
        int n2 = 2;
        
        //Adição
        int adicao = n1 + n2;
        System.out.println("Adição: "+adicao);
        //Subtração
        int sub = n2 - n1;
        System.out.println("Subtração: "+sub);
        //Multiplicação
        int mult = n1 * n2;
        System.out.println("Multiplicação: "+mult);
        //Divisão
        int div = n1 / n2;
        System.out.println("Divisão: "+div);
        //Resto
        int rest = n1 % n2;
        System.out.println("Resto: "+rest);
        
        //Exemplo de calculo de média
        float m = (n1+n2) / 2;
        System.out.println("A média é igual a " + m);
        
        
        
        //OPERADORES UNÁRIOS
        //Incremento
        int numero = 5;
        numero++;                               //Add +1 no numero
        System.out.println("O número incrementado é: " + numero);
        //Decremento
        int numero2 = 10;
        numero2--;
        System.out.println("O númeor decrementado é: " + numero2);
       
        //Pré-incremento, irá incrementar 1 antes de efetuar a soma.
        int num = 5;
        int valor = 5 + ++num;                  //Pegue o 5 e some com o incremento de num(6).
        System.out.println("O valor pré incrementado é: " + valor);
        
        //Pós-incremento, irá incrementar 1 após efetuar a soma.
        int num2 = 5;
        int valor2 = 5 + num2++;                  //Pegue o 5 e some com o incremento de num(5).
        System.out.println("O valor pós incrementado é: " + valor2);
        
        //Decremento
        //Pré-decremento, irá decrementar 1 antes de efetuar a soma.
        int num3 = 10;
        int valor3 = 4 + --num3;                  //Pegue o 5 e some com o incremento de num(6).
        System.out.println("O valor pré decrementado é: " + valor3);
        
        //Pós-incremento, irá incrementar 1 após efetuar a soma.
        int num4 = 10;
        int valor4 = 4 + num4--;                  //Pegue o 5 e some com o incremento de num(5).
        System.out.println("O valor pós decrementado é: " + valor4);
        
        
        
        //OPERADORES DE ATRIBUIÇÃO
        //Soma e atribuição
        int x = 4;
        x += 2;                 //x = x + 2
        System.out.println("O valor de x é: " + x);
        //Subtrair e atribuição
        int x1 = 4;
        x1 -= 2;                 //x = x - 2
        System.out.println("O valor de x1 é: " + x1);
        //Multiplicar e atribuição
        int x2 = 4;
        x2 *= 2;                 //x = x * 2
        System.out.println("O valor de x2 é: " + x2);
        //Dividir e atribuição
        int x3 = 4;
        x3 /= 2;                 //x = x / 2
        System.out.println("O valor de x3 é: " + x3);
        //Resto e atribuição
        int x4 = 4;
        x4 %= 2;                 //x = x % 2
        System.out.println("O valor de x4 é: " + x4);
        
        
        
        //Classe Math
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Digite o numero: ");
        float v = teclado.nextFloat();
        //Exponenciação
        int exp = (int) Math.pow(v, 2);
        System.out.println("O valor elevado a 2 é: " + exp);
        //Raiz Quadrada
        int sqt = (int) Math.sqrt(v);
        System.out.println("A raiz quadrada do numero é: " + sqt);
        //Raiz Cúbida
        int cbt = (int) Math.cbrt(v);
        System.out.println("A raiz cúbica do numero é: " + cbt);
        
        
               
        //ARREDONDAMENTO
        Scanner digito = new Scanner(System.in);
        System.out.print("Entre com um numero para ser arredondado: ");
        float n = teclado.nextFloat();
        //Valor Absoluto
        int abs = (int) Math.abs(n);
        System.out.println("O valore absoluto é: " + abs);
        //Arredondamento para baixo
        int floor = (int) Math.floor(n);
        System.out.println("O arredondamento para baixo é: " + floor);
        //Arredondamento para cima
        int ceil = (int) Math.ceil(n);
        System.out.println("O arredondamento para cima é: " + ceil);
        //Arredondamento aritmético
        int round = (int) Math.round(n);
        System.out.println("O arredondamento aritmético é: " + round);
        
        
        
        //GERADOR DE NÚMEROS
        //Numeros entre 0 e 1.
        double ale = Math.random();
        System.out.println("O numero aleatório entreo 0 e 1 é: " + ale);
        //Numeros aleatórios entre 5 e 10.
        int nn = (int) (5 + ale * (10-5));
        System.out.println(nn);
        
    }
    
}
