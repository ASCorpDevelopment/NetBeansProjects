/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication16;

/**
 *
 * @author Adilson
 */
public class JavaApplication16 {

        static int AdicionaQuatro (int i){
            i +=4;
            System.out.println("Valor da copia local: " +i);
            return i;
        }
        
        public static void MudaArray (int [] UmArray){
            UmArray[2] = 100;
        }
    
   public static void main (String[] args){ 
       
       /**Passagem de parametros por valor e por referencia */
       
       //Passagem de parametros por valor 
        System.out.println("Mensagem de Parametros ");
        int i = 10;
        System.out.println("O valor original de i é " +i);
        int j = AdicionaQuatro(i);
        System.out.println("O valor corrente de j é " +j);
        System.out.println("O valor de i é " +i);
        
       
        //Passagem de parametro por referencia 
        
        int [] UmArray = new int [3];
               UmArray[2] = 10;
              
        System.out.println("UmArray antes = " +UmArray[2]);
        MudaArray(UmArray);
        System.out.println("UmArray depois = " +UmArray[2]);
 } 
    
}
