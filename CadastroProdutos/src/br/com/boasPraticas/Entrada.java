package br.com.boasPraticas;

import br.com.objetos.Eletronicos;
import br.com.objetos.Produtos;
import br.com.objetos.Roupas;

import java.util.Scanner;

public class Entrada {
    Scanner ler = new Scanner(System.in);
    Produtos produto = new Produtos();
    Eletronicos eletronicos = new Eletronicos();
    Roupas roupas = new Roupas();

    public void entradaPrincipal() {
        System.out.println("""
                Bem vindo ao SGP (Sistema de gerenciamento de PRoduto)
                Escolha uma função
                1 - Eletrônicos
                2 - Roupas""");
    }

    public void cadProduto(int op) {
        if (op == 1) {
            System.out.println("Informe o nome do modelo eletrônico: ");
            eletronicos.setModelo(ler.nextLine()); //setou a marca
            eletronicos.mostrar();
            Eletronicos.addLista(eletronicos.getModelo()); //vc digitou 3
            produto.loopLista();


            System.out.println("Digite 100 para parar de cadastrar");
        }
        else {
            System.out.print("Informe o nome do produto de roupa: ");
            roupas.setN
            produto.loopLista();
            System.out.println("Informe o tamanho da roupa");
            roupas.setTamanho(ler.nextLine());
            System.out.println("Informe a cor da roupa");
            roupas.setCor(ler.nextLine());
            roupas.mostrar();

            System.out.println("Digite 100 para parar de cadastrar");
        }
    }

    public void perguntarRemover(){
        System.out.println("Informe o índice do funcionário que deseja remover:");
    }

}

