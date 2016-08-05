/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.dao;

import com.asc.entidades.Endereco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class EnderecoDAO {
   
    private Connection con;
    private Endereco endereco;

    public EnderecoDAO(Connection con, Endereco endereco){
        this.con = con;
        this.endereco = endereco;
    }
    
    /**
     * 
     * @param con
     * @param endereco 
     */
    public final void cadastrarEndereco(Connection con, Endereco endereco){
        String sql = "call spCadastroEndereco(?,?,?,?)";
        
        try (CallableStatement procedimento = con.prepareCall(sql)){
                
                procedimento.setString(1, endereco.getProvincia());
                procedimento.setString(2, endereco.getMunicipio());
                procedimento.setString(3, endereco.getBairro());
                procedimento.setString(4, endereco.getnCasa());
                procedimento.execute();
                
            
        } catch (SQLException e) {
            
        }
    }
}
