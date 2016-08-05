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
public enum Provincia {

    BENGO("Bengo"),
    BENGUELA("Benguela"),
    BIE("Bié"),
    CABINDA("Cabinda"),
    CUNENE("Cunene"),
    HUILA("Huila"),
    KUANDO_KUBANGO("Kuando Kubango"),
    KUANZA_SUL("Kuanza Sul"),
    KUANZA_NORTE("Kanza Norte"),
    LUANDA("Luanda"),
    LUNDA_NORTE("Lunda Norte"),
    LUNDA_SUL("Lunda Sul"),
    MALANGE("Malange"),
    MOXICO("Moxíco"),
    NAMIBE("Namibe"),
    UIGE("Uíge"),
    ZAIRE("Zaire"),
    HUAMBO("Huanbo");
    
    private final String provincia;

    private Provincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }
}
