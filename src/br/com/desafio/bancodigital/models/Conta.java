package br.com.desafio.bancodigital.models;

import br.com.desafio.bancodigital.interfaces.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("----Saldo insuficiente----");
            imprimirExtrato();
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("----Transferencia Realizada com Sucesso----");

        } else {
            System.out.println("----Saldo insuficiente----");
        }
    }

    protected void extrato() {
        System.out.println(
                "Cliente: " + this.getCliente().getClienteNome() + " - CPF: " + this.getCliente().getClienteCPF());
        System.out.println(String.format("Agencia : %d", this.getAgencia()));
        System.out.println(String.format("Número : %d", this.getNumero()));
        System.out.println(String.format("Saldo : %.2f", this.getSaldo()));
        System.out.println("--- FIM ---");
        System.out.println("");
    }

    /**
     * @return int return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return double return the saldo
     */
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "\n" +
                "Agencia: '" + getAgencia() + '\'' +
                ", Numero: " + getNumero() +
                ", Saldo: ' " + getSaldo() + '\'' +
                ", Titular: '" + getCliente().toString() + '\'';
    }
}