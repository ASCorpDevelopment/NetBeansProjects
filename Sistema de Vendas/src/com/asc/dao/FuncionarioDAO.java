/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.dao;

import com.asc.entidades.Funcionario;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author adils
 */
public class FuncionarioDAO {
    
    private Connection  con;

    public FuncionarioDAO(Connection con) {
        this.con = con;
    }
  
    /**
     * 
     * @param con
     * @param funcionario
     * @return 
     */
    public final Boolean cadastroFuncionario(Connection con, Funcionario funcionario){
       String sql = "call spCadastroFuncionario(?,?,?,?,?,?,?,?)";
       Boolean msg = false;
        try (CallableStatement procedimento = con.prepareCall(sql)){
            
                procedimento.setString(1, funcionario.getNome());
                procedimento.setString(2, funcionario.getBi());
                procedimento.setInt(4, funcionario.getIdEstado());
                procedimento.setInt(5, funcionario.getIdCategoria());
                procedimento.setInt(6, funcionario.getIdSexo());
                procedimento.setInt(7, funcionario.getIdNascimento());
                procedimento.setInt(8, funcionario.getIdEndereco());
                msg = procedimento.execute();
                
        } catch (Exception e) {
                msg = false;
        }
        return msg;
    } 
}
