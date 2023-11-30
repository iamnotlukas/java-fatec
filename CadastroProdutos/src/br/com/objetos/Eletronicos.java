package br.com.objetos;

public class Eletronicos extends Produtos{
    private String modelo;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

public void mostrar(){
    System.out.println("Modelo: " + getModelo() +" Ligando e conectando wi-fi");
}
}
