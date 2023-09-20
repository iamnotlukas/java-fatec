import java.util.Random;
import java.util.Scanner;

public class impar {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números aleatórios.
        int[] numerosAleatorios = new int[30];

        // Gere os números aleatórios.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        // Inicialize o contador de números ímpares.
        int numerosImpares = 0;

        // Use um loop para contar os números ímpares.
        for (int numero : numerosAleatorios) {
            if (numero % 2 == 1) {
                numerosImpares++;
            }
        }

        // Imprima o número de números ímpares.
        System.out.println("O número de números ímpares é " + numerosImpares);

        // Feche o scanner.
        scanner.close();
    }
}
