/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author adils
 */
public class EstadoDAO {

    private Connection con;

    public EstadoDAO(Connection con) {
        this.con = con;
    }
  
    public final ResultSet buscarEstado(Connection con)
    {
        String sql ="call spBucarEstado()";
        ResultSet resultado = null;
        
        try (CallableStatement procedimento = con.prepareCall(sql))
        {
           resultado = procedimento.executeQuery();
            
        } catch (Exception e) {
        }
        
        return resultado;
    }
}
