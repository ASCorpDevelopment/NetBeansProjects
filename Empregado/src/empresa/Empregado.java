/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

/**
 *
 * @author Adilson
 */
public class Empregado {
    private String nome;
    private double salario;
    
    public double getSalario (double salario){
        return this.salario;
    }
    
}

class Gerente extends Empregado {
    private double bonus;
    
    public double getSalario (double b){   
        this.bonus = b;
        return bonus;
    }
}