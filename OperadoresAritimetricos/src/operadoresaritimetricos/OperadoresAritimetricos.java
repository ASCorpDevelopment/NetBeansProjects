/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operadoresaritimetricos;

/**
 *
 * @author Adilson
 */
public class OperadoresAritimetricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 +n2)/2;
        System.out.println("A media é " +m);
        
        int numero = 5;
        
        numero++;
        System.out.println("O incremento é" +numero);
        
        float x = (float) Math.random()*10; 
        
        System.out.println(x);
        
        //OPERADOR TERNARIO
        
        int maior = n1 > n2 ? n1 : n2;
        System.out.println("O Maior é " +maior);
        
        
    }
    
}
