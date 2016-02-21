/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparacaostring;

/**
 *
 * @author Adilson
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Adilson";
        String nome2 = "Adilson";
        String nome3 = new String("Adilson");
        String res = (nome1==nome2)?"Igual":"Diferente";
        
        System.out.println("O resultado é " +res);
        
        res = (nome1==nome3)?"Igual":"Diferente";
        
        System.out.println("O resultado é " +res);
        
        res = (nome3.equals(nome1))?"Igual":"Diferente";
        
        System.out.println("O resultado é " +res);
    }
    
}
