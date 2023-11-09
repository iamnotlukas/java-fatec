package br.com.polimorfismo.objetos;

public class Pessoa {
    private String nome;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }
}


















