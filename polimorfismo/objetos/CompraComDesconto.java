package br.com.polimorfismo.objetos;

public class CompraComDesconto extends Compra {
    @Override
    public double calcularValor() {
        return super.calcularValor() - (super.calcularValor() * super.getCupom().getDesconto());
    }
}


