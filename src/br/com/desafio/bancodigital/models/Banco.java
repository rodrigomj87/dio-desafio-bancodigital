package br.com.desafio.bancodigital.models;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    @Override
    public String toString() {
        return "Nome do Banco: " + nome + "\nContas deste Banco: " + contas;
    }


    public  Banco(String nome) {   
        this.setNome(nome);     
    }


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * @return List<Conta> return the contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}