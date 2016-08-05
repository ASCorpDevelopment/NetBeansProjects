/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.entidades;

import com.bsangola.enums.Cargo;
import com.bsangola.enums.Estado;
import com.bsangola.enums.Sexo;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Adilosn Cardoso
 */
@Entity
public class Funcionario {
    
    private int codigo;
    private String nome;
    private String sobrenome;
    private Sexo sexo;
    private Cargo cargo;
    private Estado estado;
    private String numeroBI;
    private Endereco endereco;
    private Date dataCadastro;
    private Date dataAlteracao;
    private Date dataNascimento;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, Sexo sexo, Cargo cargo, Estado estado, String numeroBI, Endereco endereco, Date dataCadastro, Date dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.estado = estado;
        this.numeroBI = numeroBI;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Enumerated(EnumType.STRING)
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Enumerated(EnumType.STRING)
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Enumerated(EnumType.STRING)
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNumeroBI() {
        return numeroBI;
    }

    public void setNumeroBI(String numeroBI) {
        this.numeroBI = numeroBI;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    
    
    
    @PrePersist
    @PreUpdate
    private void autoInsert(){
        
        if(this.dataCadastro == null){
            this.setDataCadastro(new Date());
        } else {
            this.setDataAlteracao(new Date());
        }  
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codigo;
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
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
