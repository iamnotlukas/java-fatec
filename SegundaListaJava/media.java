import java.util.Random;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números aleatórios.
        int[] numerosAleatorios = new int[20];

        // Gere os números aleatórios.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        // Calcule a média dos números aleatórios.
        double media = 0;
        for (int numero : numerosAleatorios) {
            media += numero;
        }
        media /= numerosAleatorios.length;

        // Imprima a média dos números aleatórios.
        System.out.println("A média dos números aleatórios é " + media);

        // Feche o scanner.
        scanner.close();
    }
}
