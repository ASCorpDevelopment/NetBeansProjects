/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertions;

import java.util.Scanner;

/**
 *
 * @author Adilson
 */
public class Assertions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um numero no intervalo de 0 a 10");
        int numero = s.nextInt();
        
        assert(numero >=0 && numero<=10) : "Numero invalido" + numero;
        System.out.println("O numero é " +numero);
    }
    
}
