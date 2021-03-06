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
public class Contato {
    private String telefone;
    private String celular;
    private String email;

    public Contato() {
    
    }

    public Contato(String telefone, String celular, String email) {
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "telefone=" + telefone + ", celular=" + celular + ", email=" + email + '}';
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
