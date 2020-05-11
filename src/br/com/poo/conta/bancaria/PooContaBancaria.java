/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.conta.bancaria;

import br.com.poo.conta.bancaria.app.ClienteFisicoApp;
import br.com.poo.conta.bancaria.app.ClienteJuridicoApp;
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
        ClienteFisicoApp cfa = new ClienteFisicoApp();
        
        PessoaFisica contaFisica =  cfa.cadastrarConta();
        
        ClienteJuridicoApp cja = new ClienteJuridicoApp();
        
        PessoaJuridica contaJuridica =  cja.cadastrarConta();
        
        System.out.println("Conta Fisica: "+ contaFisica.toString());
                
        System.out.println("--------------------------------------");
                
        System.out.println("Conta Juridica: "+ contaJuridica.toString());
    }
    
}
