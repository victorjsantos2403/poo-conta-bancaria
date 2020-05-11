/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.conta.bancaria.app;

import br.com.poo.conta.bancaria.entity.Banco;
import br.com.poo.conta.bancaria.entity.Conta;
import br.com.poo.conta.bancaria.entity.Contato;
import br.com.poo.conta.bancaria.entity.Endereco;
import br.com.poo.conta.bancaria.entity.PessoaFisica;
import br.com.poo.conta.bancaria.interfaces.ClienteFisicoInterface;

/**
 *
 * @author victorjesus
 */
public class ClienteFisicoApp implements ClienteFisicoInterface {

    @Override
    public PessoaFisica cadastrarConta() {
       Conta c = new Conta(1, 10.000, 10103, "agencia a", new Banco(11, "banco a"),new Endereco("juma", 115, "a", "a", "sp", "04820030"));
       PessoaFisica pf = new PessoaFisica("05211005260", new Endereco("juma", 115, "a", "a", "sp", "04820030"), new Contato(), c, "Victor", "222727743", "M");
       return pf;
    }

    
}
