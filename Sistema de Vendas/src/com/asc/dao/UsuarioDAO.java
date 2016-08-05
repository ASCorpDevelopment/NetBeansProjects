/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.dao;

import com.asc.entidades.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class UsuarioDAO {
    
    private Connection con;
    private Usuario usuario;

    public UsuarioDAO(Connection con, Usuario usuario) {
        this.con = con;
        this.usuario = usuario;
    }
      
   /**
    * 
    * @param con
    * @param usuario
    * @return 
    */
    public static final Boolean autenticarUsuario(Connection con, Usuario usuario){
        String sql = "call spAutenticarUsuario(?,?)";
        Boolean autenticado = false;
        
        try(CallableStatement procedimento = con.prepareCall(sql)) 
        {
           procedimento.setString(1, usuario.getUsuario());
           procedimento.setString(2, usuario.getSenha());
           
            try (ResultSet resultado = procedimento.executeQuery())
            {
                
                if (resultado.next()) 
                {
                    System.out.println("Usuario autenticado!");
                    autenticado = true;
                } 
                else 
                {
                    System.err.println("Usuario não autenticado!");
                }
            } 
              
        } catch (SQLException e) {
            System.err.println("Inpossível fazer a consulta!!");
        }
        
        return autenticado;
     
    }
    
    /**
     * 
     * @param con
     * @param usuario
     * @return 
     */
    public final Boolean cadastroUsuario(Connection con, Usuario usuario){
       String sql = "call spCadastroUsuario(?,?)";
       Boolean status = false;
        try (CallableStatement procedimento = con.prepareCall(sql)){
                procedimento.setString(1, usuario.getUsuario());
                procedimento.setString(2, usuario.getSenha());
                status = procedimento.execute();
        } catch (Exception e) {
                status = false;
        }
       
        return status;
    }
}
