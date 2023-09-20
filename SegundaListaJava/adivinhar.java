import java.util.Scanner;
import java.util.Random;

public class adivinhar {

    public static void main(String[] args) {
        // Crie um gerador de números aleatórios.
        Random random = new Random();

        // Gere um número aleatório.
        int numeroAleatorio = random.nextInt(101);

        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Inicialize o número de tentativas.
        int tentativas = 0;

        // Defina o limite de tentativas.
        int limiteTentativas = 10;

        // Faça o usuário adivinhar o número.
        while (true) {
            // Peça ao usuário para fazer um palpite.
            System.out.println("Digite um número entre 1 e 100:");
            int palpite = scanner.nextInt();

            // Verifique se o palpite está correto.
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite foi alto.");
            } else {
                System.out.println("Seu palpite foi baixo.");
            }

            // Incremente o número de tentativas.
            tentativas++;

            // Verifique se o usuário atingiu o limite de tentativas.
            if (tentativas >= limiteTentativas) {
                System.out.println("Você perdeu! O número era " + numeroAleatorio);
                break;
            }
        }

        // Feche o scanner.
        scanner.close();
    }
}
