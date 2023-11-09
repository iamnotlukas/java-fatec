package br.com.polimorfismo.objetos;

public class Endereco extends Pessoa{
    private String bairro;
    private String cidade;
    private int cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void imprimirDados(){

        System.out.println("Cidade: " + getCidade());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cep: " + getCep());
    }
}





