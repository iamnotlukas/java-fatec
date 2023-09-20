import java.util.Random;
import java.util.Scanner;

public class maxandmin {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números aleatórios.
        int[] numerosAleatorios = new int[15];

        // Gere os números aleatórios.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        // Encontre o maior e o menor valor.
        int maior = numerosAleatorios[0];
        int menor = numerosAleatorios[0];
        for (int numero : numerosAleatorios) {
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        // Imprima o maior e o menor valor.
        System.out.println("O maior valor é " + maior);
        System.out.println("O menor valor é " + menor);

        // Feche o scanner.
        scanner.close();
    }
}
