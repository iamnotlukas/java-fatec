import java.util.Scanner;
public class SenhaSecreta {
    public static void main(String[] args) {
        /*
    Senha Secreta: Defina uma senha secreta (por exemplo: "python123").
    Use um loop while para pedir ao usuário que insira a senha. Se a senha estiver incorreta,
    continue pedindo a senha e informe ao usuário que a tentativa foi inválida.
    Se ele acertar, saia do loop e imprima uma mensagem de sucesso.
         */
        Scanner scanner = new Scanner(System.in);
        String senhaSecreta = "python123";

        // Declara uma variável booleana para indicar se a senha está correta
        boolean senhaCorreta = false;

        // Itera enquanto a senha não estiver correta
        while (!senhaCorreta) {

            // Solicita ao usuário que insira a senha
            System.out.print("Digite a senha: ");

            // Lê a senha digitada pelo usuário
            String senhaDigitada = scanner.nextLine();

            // Compara a senha digitada com a senha secreta
            if (senhaDigitada.equals(senhaSecreta)) {

                // Marca a senha como correta
                senhaCorreta = true;

                // Imprime uma mensagem de sucesso
                System.out.println("Senha correta! Acesso concedido.");

                // Se a senha estiver incorreta, imprime uma mensagem de erro
            } else {
                System.out.println("Senha incorreta. Tentativa inválida.");
            }
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}



