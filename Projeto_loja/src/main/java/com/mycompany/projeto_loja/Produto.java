/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto_loja;

/**
 *
 * @author aluno
 */
public class Produto {

    /**
     * @return the cod_produto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_produto the cod_produto to set
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     * @return the cod_barra
     */
    public int getCod_barra() {
        return cod_barra;
    }

    /**
     * @param cod_barra the cod_barra to set
     */
    public void setCod_barra(int cod_barra) {
        this.cod_barra = cod_barra;
    }

    /**
     * @return the nome_pd
     */
    public String getNome_pd() {
        return nome_pd;
    }

    /**
     * @param nome_pd the nome_pd to set
     */
    public void setNome_pd(String nome_pd) {
        this.nome_pd = nome_pd;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * @return the lucro
     */
    public float getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(float lucro) {
        this.lucro = lucro;
    }
    
    private int cod_produto;
    private int cod_barra;
    private String nome_pd;
    private String descricao;
    private String marca;
    private String modelo;
    private float preco;
    private float custo;
    private float lucro;
    
}
