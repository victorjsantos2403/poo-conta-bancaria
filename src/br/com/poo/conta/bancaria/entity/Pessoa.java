/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.conta.bancaria.entity;

/**
 *
 * @author victorjesus
 */
public abstract class Pessoa {
    private String nome;
    private String rg;
    private String sexo;

    public Pessoa() {
    
    }

    public Pessoa(String nome, String rg, String sexo) {
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + '}';
    }
    
}
