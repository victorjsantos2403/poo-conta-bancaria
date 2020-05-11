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
public class Agencia {
    
    private int codigo;
    private String nome;
    private Banco banco;
    private Endereco endereco;

    public Agencia() {
    }

    public Agencia(int codigo, String nome, Banco banco, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.banco = banco;
        this.endereco = endereco;
    }

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

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Agencia{" + "codigo=" + codigo + ", nome=" + nome + ", banco=" + banco + ", endereco=" + endereco + '}';
    }
    
    
    
    
}
