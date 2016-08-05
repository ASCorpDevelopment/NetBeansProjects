/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsangola.cruds;

import com.asc.dao.*;
import com.asc.entidades.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class CategoriaDAO {
   
    private Connection con;
    private Categoria categoria;

    public CategoriaDAO(Connection con, Categoria categoria){
        this.con = con;
        this.categoria = categoria;
    }
    
    /**
     * 
     * @param con
     * @param categoria 
     */
    public final void cadastrarCategoria(Connection con, Categoria categoria){
        String sql = "call spCadastroContacto(?,?)";
        
        try (CallableStatement procedimento = con.prepareCall(sql)){
                
                procedimento.setString(1, categoria.getCategoria());
                procedimento.setDouble(2, categoria.getSalario());
                procedimento.execute();
                
            
        } catch (SQLException e) {
            
        }
    }
    
}
