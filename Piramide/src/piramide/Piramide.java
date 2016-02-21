package piramide;
/**
 *
 * @author Adilson
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int x=10; int z=10; int a; int cont = 1; int i =1;
          
          while(x>=0){
              z = z-cont;
              while(z>=0){
                  System.out.print(" ");
                  z = z - 1 ;
              }
             for(a=0; i>a; ++a){
                 if (a==0 && i ==1){
                     System.out.print("*");
                     break;
                 }else 
                     System.out.print("*");
             }
              
                 
                 
                 
                System.out.println("");
                x = x - 1 ;
                i = i + 2;
                z = 10;
                cont ++;
                
                
                
                
                
          }
        
    }
    
}
