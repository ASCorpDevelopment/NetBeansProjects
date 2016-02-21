/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;



/**
 *
 * @author Adilson
 */
public class Pessoa {
   
    private String nome;
    private int anoNascimento;
    private float altura;
    private String estadoCivil;
    
        Pessoa (String nome, int anoNascimento, float altura, String estadoCivil ){
            this.nome = nome;
            this.anoNascimento = anoNascimento;
            this.altura = altura;
            this.estadoCivil = estadoCivil;        
        }
        
        public void pintaCabelo (String cor){
            String corCabelo = cor ;
        }
        
        public String getNome (){
            return this.nome;
        }
        
        
        public static void main(String[] args) {
        
            Pessoa c = new Pessoa ("Adilson", 1992, 1.67f, "Solteiro");
            System.out.println("Nome: " +c.nome +" Ano de Nascimento: " +c.anoNascimento +" Altura: " +c.altura +" Estado Civil: " +c.estadoCivil);
            
            Aluno a = new Aluno ("Adilson", 1992, 1.67f, "Solteiro");
            
            
            
    }
}

class Aluno extends Pessoa {

    public Aluno(String nome, int anoNascimento, float altura, String estadoCivil) {
        super(nome, anoNascimento, altura, estadoCivil);
    }
}


