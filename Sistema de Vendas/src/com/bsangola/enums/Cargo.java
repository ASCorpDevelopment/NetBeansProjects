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
public enum Cargo {
    
    GERENTE("Gerente"), 
    ATENDEDOR_DE_CAIXA("Atendedor de caixa"),
    COZINHEIRO("Cozinheiro"),
    EMPREGADO_DE_LIMPEZA("Empregado de Mesa"),
    EMPREGADO_DE_MESA("Empregado de Limpesa");
    
    private final String cargo;

    private Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
        
}
