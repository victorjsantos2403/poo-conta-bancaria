/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.conta.bancaria;

import br.com.poo.conta.bancaria.entity.Banco;
import br.com.poo.conta.bancaria.entity.Conta;
import br.com.poo.conta.bancaria.entity.Contato;
import br.com.poo.conta.bancaria.entity.Endereco;
import br.com.poo.conta.bancaria.entity.PessoaFisica;
import br.com.poo.conta.bancaria.entity.PessoaJuridica;

/**
 *
 * @author victorjesus
 */
public class PooContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta c1 = new Conta(1, 10000.0, 10103, "agencia a", new Banco(11, "banco a"),new Endereco("juma", 115, "a", "a", "sp", "04820030"));
        PessoaFisica contaFisica = new PessoaFisica("05211005260", new Endereco("juma", 115, "a", "a", "sp", "04820030"), new Contato("40028922","941805287","victor@hotmail.com"), c1, "Victor", "222727743", "M");
       
        Conta c2 = new Conta(1, 1000.0, 10103, "agencia a", new Banco(11, "banco a"),new Endereco("juma", 115, "a", "a", "sp", "04820030"));
        PessoaJuridica contaJuridica = new PessoaJuridica("04541625000111", new Endereco("juma", 115, "a", "a", "sp", "04820030"), new Contato("40028922","941805287","victor@hotmail.com"), c2, "Victor", "222727743", "M");
        
        System.out.println("Conta Fisica: "+ contaFisica.getCpf()+ " Agencia: "+ contaFisica.getConta().getCodigo()+ " Banco: "+ contaFisica.getConta().getBanco().getNome()+ " Saldo: "+ contaFisica.getConta().getSaldo());
                
        System.out.println("--------------------------------------");
                
        System.out.println("Conta Juridica: "+ contaJuridica.getCnpj() + " Agencia: "+ contaJuridica.getConta().getCodigo()+ " Banco: "+ contaJuridica.getConta().getBanco().getNome()+ " Saldo: "+ contaJuridica.getConta().getSaldo());
        
        System.out.println("--------------------------------------");
        System.out.println("---- Realizando Saque PF -------------");
        System.out.println("Saldo Anterior " + contaFisica.getConta().getSaldo());
        System.out.println("Valor do saque: "+ 230);
        System.out.println(contaFisica.getConta().sacar(230));
        System.out.println("Saldo Atual " + contaFisica.getConta().getSaldo());
        
        System.out.println("--------------------------------------");
        System.out.println("---- Realizando Saque PJ -------------");
        System.out.println("Saldo Anterior " + contaJuridica.getConta().getSaldo());
        System.out.println("Valor do saque: "+ 2030);
        System.out.println(contaJuridica.getConta().sacar(2030));
        System.out.println("Saldo Atual " + contaJuridica.getConta().getSaldo());
        
        
        System.out.println("--------------------------------------");
        System.out.println("---- Realizando Deposito PF -------------");
        System.out.println("Saldo Anterior " + contaFisica.getConta().getSaldo());
        System.out.println("Valor do deposito: "+ 1030);
        System.out.println(contaFisica.getConta().depositar(1030));
        System.out.println("Saldo Atual " + contaFisica.getConta().getSaldo());
        
        System.out.println("--------------------------------------");
        System.out.println("---- Realizando Saque PJ -------------");
        System.out.println("Saldo Anterior " + contaJuridica.getConta().getSaldo());
        System.out.println("Valor do deposito: "+ 620);
        System.out.println(contaJuridica.getConta().depositar(620));
        System.out.println("Saldo Atual " + contaJuridica.getConta().getSaldo());
        
    }
    
}
