/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsangola.entidades;

import static com.asc.security.CriptografiaMD5.getMD5;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author adils
 */
public class Usuario {
    
    private Integer codigo;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(String usuario, String senha) {
        try {
            this.usuario = usuario;
            this.senha = getMD5(senha);
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Erro de segurança não foi possível criptografar a senha do usuario",null,JOptionPane.ERROR_MESSAGE);
        }
    }

    public Usuario(Integer codigo, String usuario, String senha) {
        try {
            this.codigo = codigo;
            this.usuario = usuario;
            this.senha = getMD5(senha);
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Erro de segurança não foi possível criptografar a senha do usuario",null,JOptionPane.ERROR_MESSAGE);
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        try {
            this.senha = getMD5(senha);
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Erro de segurança não foi possível criptografar a senha do usuario",null,JOptionPane.ERROR_MESSAGE);
        }
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codigo);
        hash = 53 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
}
