import java.util.Random;
import java.util.Scanner;

public class buscarLinear {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números.
        int[] numeros = new int[25];

        // Gere os números aleatórios.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // Peça ao usuário para inserir um número.
        System.out.println("Digite um número:");
        int numeroBuscado = scanner.nextInt();

        // Verifique se o número está no array.
        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        // Informe o resultado da busca.
        if (encontrado) {
            System.out.println("O número " + numeroBuscado + " está no array.");
        } else {
            System.out.println("O número " + numeroBuscado + " não está no array.");
        }
    }
}
