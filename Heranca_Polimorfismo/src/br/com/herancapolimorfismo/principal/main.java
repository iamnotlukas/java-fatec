package br.com.herancapolimorfismo.principal;

// Importação das classes necessárias para o funcionamento do código
import br.com.herancapolimorfismo.boasPraticas.Entrada;
import br.com.herancapolimorfismo.objeto.Faxineiro;
import br.com.herancapolimorfismo.objeto.Gerente;
import br.com.herancapolimorfismo.objeto.Vendedor;

import java.util.Scanner; // Importação da classe Scanner para a leitura do input do usuário

public class main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Scanner para ler o input do usuário
        Scanner ler = new Scanner(System.in);

        // Criação de um objeto da classe Entrada
        Entrada entrada = new Entrada();

        // Loop do-while que continuará enquanto a opção escolhida pelo usuário for diferente de 4
        do{

            // Chama o método Entrada() do objeto entrada
            entrada.Entrada();

            // Lê o próximo número inteiro inserido pelo usuário e o define como a opção escolhida
            entrada.setOp(ler.nextInt());

            // Chama o método Switch() do objeto entrada
            entrada.Switch();


        }while(entrada.getOp()!=4);
    }
}
