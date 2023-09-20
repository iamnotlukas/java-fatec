import java.util.Scanner;

public class preencher {

    public static void main(String[] args) {
        // Crie um scanner para obter a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Crie um array para armazenar os números.
        int[] numeros = new int[10];

        // Peça ao usuário para inserir 10 números.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        // Encontre o valor mais frequente.
        int valorMaisFrequente = numeros[0];
        int frequenciaMaisFrequente = 1;
        for (int i = 1; i < numeros.length; i++) {
            int numeroAtual = numeros[i];
            int frequenciaAtual = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] == numeroAtual) {
                    frequenciaAtual++;
                }
            }
            if (frequenciaAtual > frequenciaMaisFrequente) {
                valorMaisFrequente = numeroAtual;
                frequenciaMaisFrequente = frequenciaAtual;
            }
        }

        // Imprima o valor mais frequente e a sua frequência.
        System.out.println("O valor mais frequente é " + valorMaisFrequente + " e aparece " + frequenciaMaisFrequente + " vezes.");
    }
}
