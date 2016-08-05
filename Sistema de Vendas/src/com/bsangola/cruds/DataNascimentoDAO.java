/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsangola.cruds;

import com.asc.dao.*;
import com.asc.entidades.DataNascimento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class DataNascimentoDAO {
    
    private Connection con;
    private DataNascimento dataNascimento;

    public DataNascimentoDAO(Connection con, DataNascimento dataNascimento) {
        this.con = con;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * 
     * @param con
     * @param dataNascimento 
     */
    public final void cadastrarDataNascimento(Connection con, DataNascimento dataNascimento){
        String sql = "call spCadastroNascimento(?,?,?)";
        
        try (CallableStatement procedimento = con.prepareCall(sql)){
                
                procedimento.setInt(1, dataNascimento.getDia());
                procedimento.setString(2, dataNascimento.getMes());
                procedimento.setInt(3, dataNascimento.getAno());
                procedimento.execute();
                
            
        } catch (SQLException e) {
            
        }
    }
}
