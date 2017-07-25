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
public class Item extends Venda {

    /**
     * @return the cod_prod
     */
    public int getCod_prod() {
        return cod_prod;
    }

    /**
     * @param cod_prod the cod_prod to set
     */
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the vl_unitario
     */
    public float getVl_unitario() {
        return vl_unitario;
    }

    /**
     * @param vl_unitario the vl_unitario to set
     */
    public void setVl_unitario(float vl_unitario) {
        this.vl_unitario = vl_unitario;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
    
    private int cod_prod;
    private int quantidade;
    private float vl_unitario;
    private float total;
    
    
}
