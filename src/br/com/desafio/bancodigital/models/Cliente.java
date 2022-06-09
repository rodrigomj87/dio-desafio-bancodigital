package br.com.desafio.bancodigital.models;

public class Cliente {
    private int clienteId;
    private String clienteNome;
    private String clienteCPF;

    public Cliente(int id, String nome, String cpf) {
        this.setClienteId(id);
        this.setClienteNome(nome);
        this.setClienteCPF(cpf);
    }

    /**
     * @return int return the clienteId
     */
    public int getClienteId() {
        return clienteId;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * @return String return the clienteNome
     */
    public String getClienteNome() {
        return clienteNome;
    }

    /**
     * @param clienteNome the clienteNome to set
     */
    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    /**
     * @return String return the clienteCPF
     */
    public String getClienteCPF() {
        return clienteCPF;
    }

    /**
     * @param clienteCPF the clienteCPF to set
     */
    public void setClienteCPF(String clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    @Override
    public String toString() {
        return "[CPF: " + clienteCPF + ", Nome: " + clienteNome + "]";
    }

}