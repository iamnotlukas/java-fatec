import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {

 {
     /*1ºatividade -Faixa Etária:
     Receba a idade de uma pessoa e imprima se ela é:
     menor de idade, adulta ou idosa
     (use, por exemplo, 18 para adulta e 60 para idosa).
      */
                // Declara a variável idade
     int idade;

     // Cria um objeto Scanner para ler a entrada do usuário
     java.util.Scanner scanner = new Scanner(System.in);
     // Solicita ao usuário que digite a idade da pessoa
     System.out.print("Digite a idade da pessoa: ");
     // Lê a idade da pessoa digitada pelo usuário
     idade = scanner.nextInt();

     // Classifica a idade da pessoa
     if (idade < 18) {
         // Menor de idade
         System.out.println("Menor de idade");
     } else if (idade < 60) {
         // Adulto
         System.out.println("Adulto(a)");
     } else {
         // Idoso
         System.out.println("Idoso(a)");
     }
     // Fecha o objeto Scanner
     scanner.close();
            }
        }
    }

