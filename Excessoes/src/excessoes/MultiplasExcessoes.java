package excessoes;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Adilson
 */
public class MultiplasExcessoes {
    
    Scanner teclado = new Scanner(System.in);
    boolean continua = true;
    double divisao;
    
    public double metodoDivisao(){
	do
        {
                try
		{
                        System.out.print("Digite o X : ");
                        double x = teclado.nextDouble();
			System.out.print("Digite o Y : ");
			double y = teclado.nextDouble();
			this.divisao = x / y;
			System.out.println("A divisao e: " +this.divisao);
			continua = false;
						
		}
		catch(InputMismatchException e1)
		{
			System.out.print("Os numeros devem ser inteiro");
			teclado.nextLine();
		}
		catch(ArithmeticException e2)
		{
			System.out.print("O divisor deve ser diferente de Zero 0");
			teclado.nextLine();
		}
	}
	while(continua);
	return this.divisao;	
    }
}
