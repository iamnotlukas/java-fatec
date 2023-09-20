import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie um array de 10 números aleatórios.
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // Imprima apenas os números pares.
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    } //função para numeros pares
}


