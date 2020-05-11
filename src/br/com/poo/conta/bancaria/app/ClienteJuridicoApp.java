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
import br.com.poo.conta.bancaria.entity.PessoaJuridica;
import br.com.poo.conta.bancaria.interfaces.ClienteFisicoInterface;
import br.com.poo.conta.bancaria.interfaces.ClienteJuridicoInterface;

/**
 *
 * @author victorjesus
 */
public class ClienteJuridicoApp implements ClienteJuridicoInterface {

    @Override
    public PessoaJuridica cadastrarConta() {
       Conta c = new Conta(1, 10.000, 10103, "agencia a", new Banco(11, "banco a"),new Endereco("juma", 115, "a", "a", "sp", "04820030"));
       PessoaJuridica pj = new PessoaJuridica("04541625000111", new Endereco("juma", 115, "a", "a", "sp", "04820030"), new Contato(), c, "Victor", "222727743", "M");
       return pj;
    }
    
}
