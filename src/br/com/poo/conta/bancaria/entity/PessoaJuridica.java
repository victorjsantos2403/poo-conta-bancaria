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
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private Endereco endereco;
    private Contato contato;
    private Conta conta;

    public PessoaJuridica() {
    
    }

    public PessoaJuridica(String cnpj, Endereco endereco, Contato contato, Conta conta, String nome, String rg, String sexo) {
        super(nome, rg, sexo);
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.conta = conta;
    }

    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
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
    
    
    
    public void cadastrarPessoa() {
        
    }
    
}
