/**
 * Licença Privada. Todos os direito reservados a BIG SOFT ANGOLA, SA
 * Qualquer copia, venda e o uso sem a respectiva autorização deste produto
 * estarão sujeito a sanções penais. 
 */

package com.bsangola.entidades;

import com.bsangola.enums.CategoriaProduto;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Data de Criação: 06/08/2016
 * Hora: 15:35:20
 * Empresa BIG SOFT ANGOLA, SA 
 * @author Adilson Cardoso
 */
@Entity
public class Produto {
    
    private Integer codigo;
    private String nome;
    private String descricao;
    private String marcaDoProduto;
    private BigDecimal valor;
    private Date dataCadastro;
    private CategoriaProduto categoriaProduto;

    public Produto() {
    }

    public Produto(String nome, String descricao, String marcaDoProduto, BigDecimal valor, CategoriaProduto categoriaProduto) {
        this.nome = nome;
        this.descricao = descricao;
        this.marcaDoProduto = marcaDoProduto;
        this.valor = valor;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(Integer codigo, String nome, String descricao, String marcaDoProduto, BigDecimal valor, CategoriaProduto categoriaProduto) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.marcaDoProduto = marcaDoProduto;
        this.valor = valor;
        this.categoriaProduto = categoriaProduto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarcaDoProduto() {
        return marcaDoProduto;
    }

    public void setMarcaDoProduto(String marcaDoProduto) {
        this.marcaDoProduto = marcaDoProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Enumerated(EnumType.STRING)
    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
}
