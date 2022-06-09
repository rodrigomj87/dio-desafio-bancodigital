package br.com.desafio.bancodigital.models;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("----Extrato Conta Corente----");
       System.out.println("");
       super.extrato();
        
    }
}