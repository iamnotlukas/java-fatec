import java.util.Scanner;

public class SomaImpar {
/*
- Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n.
Calcule e imprima a soma dos primeiros n números ímpares.
Por exemplo, se o usuário inserir 4,
o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.
 */
    // Solicita ao usuário que digite um número inteiro n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        // Declara duas variáveis: soma e numeroImpar
        // soma armazenará a soma dos primeiros n números ímpares
        // numeroImpar armazenará o número ímpar atual
        int soma = 0;
        int numeroImpar = 1;

        // Itera sobre os primeiros n números
        for (int i = 0; i < n; i++) {

            // Adiciona o número ímpar atual à soma
            soma += numeroImpar;

            // Incrementa o número ímpar atual em 2
            // Isso garante que o próximo número ímpar a ser adicionado à soma seja o próximo número ímpar após o atual
            numeroImpar += 2;
        }

        // Imprime a soma dos primeiros n números ímpares
        System.out.println("A soma dos primeiros " + n + " numeros impares é: " + soma);

        // Fecha o objeto Scanner
        scanner.close();
    }
}
