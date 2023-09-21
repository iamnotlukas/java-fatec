/*
Você deve criar um programa para gerenciar notas de alunos de todas as disciplinas de um semestre.
O programa deve pedir e armazenar quantas disciplinas ele possui no semestre, qual a média para aprovação,
 o nome da matéria, nota da p1, nota da p2, nota de trabalho de cada uma delas,
calcular a média das notas e apresentar o boletim do aluno com o nome de cada matéria, média e aprovado
ou não.
         */
        import java.util.Scanner;

        public class NotasEscolares {

            // Pede e armazena quantas disciplinas o aluno possui no semestre
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a quantidade de disciplinas no semestre: ");
                int quantidadeDisciplinas = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                // Pede e armazena a média para aprovação
                System.out.print("Digite a media minima para aprovacao: ");
                double mediaMinima = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer

                // Declara arrays para armazenar as notas de cada disciplina
                String[] nomesDisciplinas = new String[quantidadeDisciplinas];
                double[] notasP1 = new double[quantidadeDisciplinas];
                double[] notasP2 = new double[quantidadeDisciplinas];
                double[] notasTrabalho = new double[quantidadeDisciplinas];

                // Itera sobre as disciplinas, solicitando as notas de cada uma
                for (int i = 0; i < quantidadeDisciplinas; i++) {

                    // Solicita o nome da disciplina
                    System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
                    nomesDisciplinas[i] = scanner.nextLine();

                    // Solicita a nota da P1
                    System.out.print("Digite a nota da P1: ");
                    notasP1[i] = scanner.nextDouble();

                    // Solicita a nota da P2
                    System.out.print("Digite a nota da P2: ");
                    notasP2[i] = scanner.nextDouble();

                    // Solicita a nota do trabalho
                    System.out.print("Digite a nota do trabalho: ");
                    notasTrabalho[i] = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                }

                // Imprime o boletim do aluno
                System.out.println("\nBoletim do Aluno:\n");
                for (int i = 0; i < quantidadeDisciplinas; i++) {

                    // Calcula a média da disciplina
                    double media = (notasP1[i] + notasP2[i] + notasTrabalho[i]) / 3.0;

                    // Define a situação da disciplina
                    String situacao = media >= mediaMinima ? "Aprovado" : "Reprovado";

                    // Imprime os dados da disciplina
                    System.out.println("Disciplina: " + nomesDisciplinas[i]);
                    System.out.println("Media: " + media);
                    System.out.println("Situacao: " + situacao);
                    System.out.println();
                }

                scanner.close();
            }
        }

