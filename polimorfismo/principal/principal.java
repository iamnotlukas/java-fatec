package br.com.polimorfismo.principal;
import java.util.Scanner;


import br.com.polimorfismo.objetos.*;

public class principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Pessoa - Endereço (Composição)");
        System.out.println("2. Aluno - Disciplina (Agregação)");
        System.out.println("3. Compra - Cupom (Dependência)");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                //1º Pessoa - Endereço (Composição)
                Pessoa pessoa = new Pessoa();

                System.out.println("Digite seus dados começando por:\n" +
                                   "Nome completo:");
                pessoa.setNome(ler.nextLine());
                pessoa.setNome(ler.nextLine());

                System.out.println("CPF: ");
                pessoa.setCpf(ler.nextLine());

                Endereco endereco = new Endereco();

                System.out.println("Cidade: ");
                endereco.setCidade(ler.nextLine());

                System.out.println("Bairro: ");
                endereco.setBairro(ler.nextLine());

                System.out.println("CEP: ");
                endereco.setCep(ler.nextInt());

                pessoa.imprimirDados();
                endereco.imprimirDados();
                break;

            case 2:
               // 2º Disciplina - Aluno (Agregação):
                     //  A agregação é uma relação de "tem um" onde o objeto
                     // filho pode existir independentemente do objeto pai.

                Aluno aluno = new Aluno();
                System.out.println("Nome completo do aluno: ");
                aluno.setNome(ler.nextLine());
                aluno.setNome(ler.nextLine());

                System.out.println("Número do Aluno: ");
                aluno.setMatricula(ler.nextInt());
                ler.nextLine();

                Disciplina disciplina = new Disciplina();
                System.out.println("Nome da disciplina: ");
                disciplina.setNome(ler.nextLine());

                System.out.println("Carga horária: ");
                disciplina.setCargaHoraria(ler.nextInt());
                ler.nextLine();

                aluno.imprimirDados();
                disciplina.imprimirDados();
                break;
            case 3:
                // Compra - Cupom (Dependência)
                Cupom cupom = new Cupom();
                cupom.setCodigo("CUPOM10");
                cupom.setDesconto(0.1);

                CompraComDesconto compra = new CompraComDesconto();
                compra.setValor(100.0); // Defina o valor da compra antes de calcular o valor
                compra.setCupom(cupom);

                System.out.println("Valor da compra: " + compra.calcularValor());
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
