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
public class Conta extends Agencia {
    private int conta;
    private double saldo;

    public Conta() {
    }

    public Conta(int conta, double saldo, int codigo, String nome, Banco banco, Endereco endereco) {
        super(codigo, nome, banco, endereco);
        this.conta = conta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "conta=" + conta + ", saldo=" + saldo + '}';
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public String sacar(double saque) {
        if (saque > saldo)
            return "Não foi possivel realizar sua operação saldo insuficiente";
        if (saque < 0)
            return "Informe um valor válido para realizar esta operação";
        
        saldo = saldo - saque;
        
        return "Saque realizado com sucesso";
    }
    
    public String depositar(double deposito) {
        if (deposito < 0)
            return "Informe um valor válido para realizar esta operação";
        
        saldo = saldo + deposito;
        return "Depósito realizado com sucesso";   
    }
}
