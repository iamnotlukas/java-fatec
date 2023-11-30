package br.com.objetos;


import java.util.ArrayList;
import java.util.stream.IntStream;

public class Produtos {
    private String codigo;
    private String nome;
    private double preco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrar(){
        System.out.println("Produto" + getNome());
        System.out.println("Codigo" + getCodigo());
        System.out.println("Preço" + getPreco());
    }

    public static ArrayList<String> listaProdutos = new ArrayList<String>();

    public static void addLista(String nome){
        listaProdutos.add(nome);
    }

    public void loopLista() {
        System.out.println("*******************");
        IntStream.range(0, listaProdutos.size())
                .forEach(i -> System.out.println("Índice: " + i + ", Nome: " + listaProdutos.get(i)));
        System.out.println("*******************");
        System.out.println();
        System.out.println("""
                Deseja remover algum Produto? 
                1 - Sim, desejo remover
                2 - Não, quero continuar cadastrando""");
    }
    public void remLista(int idx){
        listaProdutos.remove(idx);
        System.out.println("Produto removido com sucesso");
        System.out.println("Abaixo segue a lista atualizada:");
        loopLista();
    }
}
