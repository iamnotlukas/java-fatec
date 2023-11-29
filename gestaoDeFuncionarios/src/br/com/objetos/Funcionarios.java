package br.com.objetos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Funcionarios {

    Scanner ler = new Scanner(System.in);
    private int codigo;
    private String cargo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void trabalhar(){
        System.out.println("Trabalhando");
    }



   public static ArrayList<String> listaFuncionarios = new ArrayList<String>();

    public static void addLista(String nome){
        listaFuncionarios.add(nome);
    }

    public void loopLista(){
        System.out.println("*******************");
        IntStream.range(0, listaFuncionarios.size())
                .forEach(i -> System.out.println("Índice: " + i + ", Nome: " + listaFuncionarios.get(i)));
        System.out.println("*******************");
        System.out.println();
        System.out.println("""
                Deseja remover algum funcionário? 
                1 - Sim, desejo remover
                2 - Não, quero continuar cadastrando""");

    }

    public void remLista(int idx){
        listaFuncionarios.remove(idx);
        System.out.println("Funcionário removido com sucesso");
        System.out.println("Abaixo segue a lista atualizada:");
        loopLista();
    }

}
