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
public class Venda {

    /**
     * @return the cod_venda
     */
    public int getCod_venda() {
        return cod_venda;
    }

    /**
     * @param cod_venda the cod_venda to set
     */
    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    /**
     * @return the num_nota_fiscal
     */
    public int getNum_nota_fiscal() {
        return num_nota_fiscal;
    }

    /**
     * @param num_nota_fiscal the num_nota_fiscal to set
     */
    public void setNum_nota_fiscal(int num_nota_fiscal) {
        this.num_nota_fiscal = num_nota_fiscal;
    }

    /**
     * @return the total_venda
     */
    public float getTotal_venda() {
        return total_venda;
    }

    /**
     * @param total_venda the total_venda to set
     */
    public void setTotal_venda(float total_venda) {
        this.total_venda = total_venda;
    }
    
    private int cod_venda;
    private int num_nota_fiscal;
    private float total_venda;
    
}
