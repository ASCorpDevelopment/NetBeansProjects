/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author Adilson
 */
public class Funcionario {
   private String nome;
	private double salario;
	private boolean ativo;
	private String senha;
	public static int total;
	
	public double getSalario(){
		return salario;
	}
	
	public void setSalario(double valor){
		salario += valor;
	}
	
	public boolean isAtivo(){
		return this.ativo;
	}
	
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
	
	public void setSenha (String novaSenha){
		senha = novaSenha;
	}
	/**
        * Metódo que falida se o novo valor inserido pela instancia do novo objecto é igual ao anterior
        * @param senha recebe uma senha ou um conjunto de string
        * @return nos retorna um valor booleano 'verdadeiro' ou 'falso'
        */
	public boolean isSenhaCorreta(String senha){
		if(this.senha == senha) return true;
		else return false;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	/**
         * Esse método esta em desenvolvimento
         */
	public static int totalDeFuncionario (){
		Funcionario.total += 1; 
		return total;
	}
}
