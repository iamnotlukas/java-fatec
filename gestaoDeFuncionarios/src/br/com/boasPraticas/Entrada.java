package br.com.boasPraticas;

import br.com.principal.Principal;
import br.com.objetos.*;

import java.util.Scanner;

public class Entrada {

    Scanner ler = new Scanner(System.in);
    Funcionarios fun = new Funcionarios();
    Desenvolvedor dev = new Desenvolvedor();
    Gerente gerente = new Gerente();


    public void entradaPrincipal(){
        System.out.println("""
                Bem-vindo ao SGF (Sistema de Gestão de Funcionários)
                Qual cargo deseja adicionar? 
                1 - Desenvolvedor 
                2 - Gerente""");
    }

    public void cadCargo(int op){
        if (op == 1){
            System.out.println("Informe o nome do Desenvolvedor: ");
            Funcionarios.addLista(ler.nextLine());
            System.out.println("""
                    Selecione uma função para realizar como desenvolvedor:
                    1 - Trabalhar""");
                int opDev = ler.nextInt();
                if (opDev == 1){
                    dev.trabalhar();
                }

        }
        else {
            System.out.print("Informe o nome do Gerente: ");
            Funcionarios.addLista(ler.nextLine());
            System.out.println("""
                    Selecione uma função para realizar como desenvolvedor:
                    1 - Permitir subir para a produção
                    2 - SolicitarMaterial
                    3 - Verificar presença dos funcionários""");
            int opGerente = ler.nextInt();
            if(opGerente == 1){
                gerente.trabalhar();
                gerente.Permitir();
            }
            else if (opGerente == 2 ){
                gerente.SolicitarMaterial();
            }
            else{
                gerente.VerificarFuncionarios();
            }

        }
    }

    public void perguntarRemover(){
        System.out.println("Informe o índice do funcionário que deseja remover:");
    }

}
