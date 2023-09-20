import java.util.Random;

public class jogodedados {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Crie uma variável para armazenar a quantidade de vezes que a soma dos dois dados resultou em 7.
        int vezes = 0;

        // Simule o lançamento de dois dados 100 vezes.
        for (int i = 0; i < 100; i++) {
            // Gere dois números aleatórios entre 1 e 6.
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            // Verifique se a soma dos dois dados é igual a 7.
            if (dado1 + dado2 == 7) {
                vezes++;
            }
        }

        // Imprima a quantidade de vezes que a soma dos dois dados resultou em 7.
        System.out.println("A soma dos dois dados resultou em 7 " + vezes + " vezes.");
    }
}
