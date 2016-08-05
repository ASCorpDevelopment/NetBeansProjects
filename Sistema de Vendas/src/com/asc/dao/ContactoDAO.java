/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.dao;

import com.asc.entidades.Contacto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class ContactoDAO {
    
    private Connection con;
    private Contacto contacto;

    public ContactoDAO(Connection con, Contacto contacto){
        this.con = con;
        this.contacto = contacto;
    }
    
    /**
     * 
     * @param con
     * @param contacto 
     */
    public final void cadastrarContacto(Connection con, Contacto contacto){
        String sql = "call spCadastroContacto(?,?,?)";
        
        try (CallableStatement procedimento = con.prepareCall(sql)){
                
                procedimento.setString(1, contacto.getTelefone());
                procedimento.setString(2, contacto.getEmail());
                procedimento.setInt(3, contacto.getIdFuncionario());
                procedimento.execute();
                
            
        } catch (SQLException e) {
            
        }
    }
    
}
