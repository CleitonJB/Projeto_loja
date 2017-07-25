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
public class Funcionario extends Pessoa {

    /**
     * @return the cod_func
     */
    public int getCod_func() {
        return cod_func;
    }

    /**
     * @param cod_func the cod_func to set
     */
    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the agencia_bc
     */
    public String getAgencia_bc() {
        return agencia_bc;
    }

    /**
     * @param agencia_bc the agencia_bc to set
     */
    public void setAgencia_bc(String agencia_bc) {
        this.agencia_bc = agencia_bc;
    }

    /**
     * @return the conta_corrente
     */
    public int getConta_corrente() {
        return conta_corrente;
    }

    /**
     * @param conta_corrente the conta_corrente to set
     */
    public void setConta_corrente(int conta_corrente) {
        this.conta_corrente = conta_corrente;
    }
    
    private int cod_func;
    private float salario;
    private String banco;
    private String agencia_bc;
    private int conta_corrente;
    
}
