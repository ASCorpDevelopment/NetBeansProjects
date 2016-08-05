/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsangola.entidades;

import com.bsangola.enums.Provincia;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author adils
 */
@Entity
public class Endereco {
    
    private Integer codigo;
    private Provincia provincia;
    private String municipio;
    private String bairro;
    private String nCasa;

    public Endereco() {
    }

    public Endereco(Provincia provincia, String municipio, String bairro, String nCasa) {
        this.provincia = provincia;
        this.municipio = municipio;
        this.bairro = bairro;
        this.nCasa = nCasa;
    }

    public Endereco(Integer codigo, Provincia provincia, String municipio, String bairro, String nCasa) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.municipio = municipio;
        this.bairro = bairro;
        this.nCasa = nCasa;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Enumerated(EnumType.STRING)
    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }  
}
