/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundo;
import java.util.Scanner;
/**
 *
 * @author Adilson
 */
public class Nota {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        
        
        System.out.println("O " +nome +" teve: " +nota);
        
        
    }
    
}
