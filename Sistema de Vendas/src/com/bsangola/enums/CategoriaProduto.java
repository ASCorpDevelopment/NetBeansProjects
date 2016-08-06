/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsangola.enums;

/**
 *
 * @author adilson
 */
public enum CategoriaProduto {
    
    BEBIDAS("Bebidas"),
    ALIMENTOS("Alimentos");
    
    private final String categoria;

    private CategoriaProduto(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
