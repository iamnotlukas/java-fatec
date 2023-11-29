package br.com.principal;

/*
1.Gestão de Funcionários em uma Empresa:
- Contexto: Desenvolver um sistema de gestão de funcionários,
onde cada funcionário é representado como um objeto.Criem classes para
 diferentes tipos de funcionários (por exemplo, gerentes, desenvolvedores)
  com herança. Utilizar abstração para identificar os atributos e métodos essenciais.

   Implementar um ArrayList para armazenar e manipular a lista de funcionários.
   Demonstração de encapsulamento, polimorfismo para operações comuns como
   apagar tabela do banco, subir para produção e desenvolver telas.
   Ao final utilize um método de iteração utilizando o foreach para exibir
   informações sobre os funcionários.

   // Cria um novo ArrayList de Strings
       ArrayList<String> frutas = new ArrayList<String>();

       // Adiciona elementos ao ArrayList
       frutas.add("Maçã");
       frutas.add("Banana");
       frutas.add("Morango");

       // Imprime o ArrayList
       System.out.println(frutas);


 */


import br.com.boasPraticas.Entrada;
import br.com.objetos.Desenvolvedor;
import br.com.objetos.Funcionarios;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        //declaração de objetos
        Scanner ler = new Scanner(System.in);
        Entrada entrada = new Entrada();
        Funcionarios fun = new Funcionarios();

        int cancelar;

        do {
        entrada.entradaPrincipal();
        entrada.cadCargo(ler.nextInt()); //acaba o programa de obter dados
        fun.loopLista();

        cancelar = ler.nextInt();

        } while (cancelar != 1);

        int voltar;
        do{

            entrada.perguntarRemover();
            fun.remLista(ler.nextInt());
            voltar = ler.nextInt();
        }while(voltar != 1);
    }
}
