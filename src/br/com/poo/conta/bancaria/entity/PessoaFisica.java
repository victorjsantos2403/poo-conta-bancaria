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
public class PessoaFisica extends Pessoa {
    private String cpf;
    private Endereco endereco;
    private Contato contato;
    private Conta conta;

    public PessoaFisica() {
    
    }

    public PessoaFisica(String cpf, Endereco endereco, Contato contato, Conta conta, String nome, String rg, String sexo) {
        super(nome, rg, sexo);
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.conta = conta;
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", endereco=" + endereco + ", contato=" + contato + ", conta=" + conta + '}';
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
}
