/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciosdelogica;

import java.util.Scanner;

/**
 *
 * @author Adilson
 */
public class ExerciciosdeLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Escreva um programa que desenha um quadrado, retangulo e circulo 
         * Algoritimo de um quadrado
        */
        
       /* for(int i=0; i<4; ++i ){
            int z =10;
            while(z>0){
                System.out.print("*");
                z--;
            }
            System.out.println("");
            z=10;
        }*/
        
        String nom[] = new String[5];
        Scanner teclado = new Scanner(System.in);        
        
        for(int i=0; i<nom.length; ++i){
            
            System.out.print("Digite o " +(i+1) +"º" +" Nome: ");
            nom[i] = teclado.nextLine();
        }
        
        for(int a=0; a<nom.length; ++a){
            System.out.println("" +nom[a]);
        }
        
    }
    
}
