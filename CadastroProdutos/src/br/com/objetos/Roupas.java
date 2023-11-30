package br.com.objetos;

public class Roupas extends Produtos {
    private String tamanho;
    private String cor;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
public void mostrar(){
    System.out.println("Tamanho: " + getTamanho());
    System.out.println("Cor: " + getCor());
}
}
