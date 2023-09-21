import java.util.Scanner;
import java.util.ArrayList;
/*
Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes,
 peça outro nome e use um loop for para percorrer a lista e verificar se o 6º(último)
nome digitado está presente no array dos 5 nomes informados inicialmente.
 */
public class ListaNomes {

    // Solicita ao usuário que insira 5 nomes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();

        System.out.println("Insira 5 nomes:");

        // Itera sobre 5 vezes
        for (int i = 0; i < 5; i++) {

            // Solicita ao usuário que insira um nome
            System.out.print("Nome " + (i + 1) + ": ");

            // Lê o nome digitado pelo usuário
            String nome = scanner.nextLine();

            // Adiciona o nome à lista
            nomes.add(nome);
        }

        // Solicita ao usuário que insira um nome para verificar
        System.out.print("Digite um nome para verificar: ");

        // Lê o nome a ser verificado
        String nomeVerificar = scanner.nextLine();

        // Declara uma variável booleana para indicar se o nome foi encontrado
        boolean encontrado = false;

        // Itera sobre a lista de nomes
        for (String nome : nomes) {

            // Compara o nome a ser verificado com o nome atual da lista
            if (nome.equalsIgnoreCase(nomeVerificar)) {

                // Marca o nome como encontrado
                encontrado = true;

                // Interrompe o loop
                break;
            }
        }

        // Imprime uma mensagem indicando se o nome foi encontrado ou não
        if (encontrado) {
            System.out.println("O nome " + nomeVerificar + " esta presente na lista.");
        } else {
            System.out.println("O nome " + nomeVerificar + " nao esta presente na lista.");
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}

