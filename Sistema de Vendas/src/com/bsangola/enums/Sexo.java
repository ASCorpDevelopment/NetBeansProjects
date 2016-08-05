/**
 * Licença Privada. Todos os direito reservados a BIG SOFT ANGOLA, SA
 * Qualquer copia, venda e o uso sem a respectiva autorização deste produto
 * estarão sujeito a sanções penais. 
 */

package com.bsangola.enums;

/**
 * Data de Criação: 05/08/2016
 * Hora: 02:31:54
 * Empresa BIG SOFT ANGOLA, SA 
 * @author Adilson Cardoso
 */
public enum Sexo {
    
    MASCULINO("Masculino"),
    FEMENINO("Femenino");
    
    private final String sexo;

    private Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescricao() {
        return sexo;
    }
}
