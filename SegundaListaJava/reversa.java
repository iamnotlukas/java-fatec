import java.util.Random;
import java.util.Scanner;

public class reversa {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números aleatórios.
        int[] numerosAleatorios = new int[10];

        // Gere os números aleatórios.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        // Imprima o array em ordem reversa.
        for (int i = numerosAleatorios.length - 1; i >= 0; i--) {
            System.out.println(numerosAleatorios[i]);
        }

        // Feche o scanner.
        scanner.close();
    }
}
