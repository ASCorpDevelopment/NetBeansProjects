/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.entidades;

/**
 *
 * @author adils
 */
public class Endereco {
    
    private int id;
    private String provincia;
    private String municipio;
    private String bairro;
    private String nCasa;

    public Endereco(String provincia, String municipio, String bairro, String nCasa) {
        this.provincia = provincia;
        this.municipio = municipio;
        this.bairro = bairro;
        this.nCasa = nCasa;
    }

    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
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
    
    
    
}
