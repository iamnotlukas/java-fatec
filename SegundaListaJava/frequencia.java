import java.util.Random;
import java.util.Scanner;

public class frequencia {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números aleatórios.
        int[] numerosAleatorios = new int[50];

        // Gere os números aleatórios.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(10) + 1;
        }

        // Crie um array para armazenar o número de vezes que cada número aparece.
        int[] ocorrencias = new int[10];

        // Conte o número de vezes que cada número aparece no array.
        for (int numero : numerosAleatorios) {
            ocorrencias[numero - 1]++;
        }

        // Imprima o número de vezes que cada número aparece.
        for (int i = 0; i < ocorrencias.length; i++) {
            System.out.println("O número " + (i + 1) + " aparece " + ocorrencias[i] + " vezes.");
        }

        // Feche o scanner.
        scanner.close();
    }
}
