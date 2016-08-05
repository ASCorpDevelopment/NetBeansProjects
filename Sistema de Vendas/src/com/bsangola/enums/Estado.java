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
public enum Estado {
    
    ACTIVO("Activo"),
    DESATIVADO("Desetivado");
    
    private final String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }   
}
