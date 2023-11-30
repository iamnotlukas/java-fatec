package br.com.principal;

import br.com.boasPraticas.Entrada;
import br.com.objetos.Produtos;

import java.util.Scanner;
//2. Cadastro de Produtos em um Estoque:
// Contexto: Criar um sistema para gerenciar um estoque de produtos em uma loja.
// Criem classes para representar diferentes tipos de produtos (eletrônicos, roupas) com herança.
// Utilizar encapsulamento para proteger dados sensíveis, abstração para identificar características essenciais e
// polimorfismo para lidar com diferentes tipos de produtos, ligar, conectar wi-fi. Implementar um ArrayList para
// armazenar e manipular a lista de produtos.
// Utilizar um método foreach para exibir informações sobre os produtos.11
public class principal {
    public static void main(String[] args){

        //declaração de objetos
        Scanner ler = new Scanner(System.in);
        Entrada entrada = new Entrada();
        Produtos produtos = new Produtos();

        int cancelar;
        do{

        entrada.entradaPrincipal(); //faz as boas vindas


        //seleciona o cargo, e manda um int
        entrada.cadProduto(ler.nextInt());

        cancelar = ler.nextInt(); //se a variavel for diferene de 100 continua a cadProdutos

        }while (cancelar != 100);


        int voltar;
        do{
            entrada.perguntarRemover(); //pergunta qual indice ele quer remover
            produtos.remLista(ler.nextInt()); //guarda o numero digitado e manda par ao metodo de remover
            voltar = ler.nextInt(); // se a variavel for diferente de 500 o programa continua no loop
        }while (voltar != 500);

    }
}
