package br.com.herancapolimorfismo.boasPraticas;

import br.com.herancapolimorfismo.objeto.Faxineiro;
import br.com.herancapolimorfismo.objeto.Gerente;
import br.com.herancapolimorfismo.objeto.Vendedor;

import java.util.Scanner;

public class Entrada {

    // Declaração da variável 'op'
    int op;

    // Método getter para obter o valor de 'op'
    public int getOp() {
        return op;
    }

    // Método setter para definir o valor de 'op'
    public void setOp(int op) {
        this.op = op;
    }

    // Declaração da variável 'opFinal'
    int opFinal;

    // Método getter para obter o valor de 'opFinal'
    public int getOpFinal() {
        return opFinal;
    }

    // Método setter para definir o valor de 'opFinal'
    public void setOpFinal(int opFinal) {
        this.opFinal = opFinal;
    }

    // Método que imprime as opções disponíveis para o usuário
    public void Entrada(){
        System.out.println("""
                    \n-----------------------------------\n
                    Escolha de acordo com os números do funcionários:
                    1 - faxineiro
                    2 - Vendedor
                    3 - Gerente
                    
                    Digite 4 para sair.
                    """);
    }

    // Método que processa a opção escolhida pelo usuário
    public void Switch(){
        // Obtem o valor de 'op' e atribui a 'opFinal'
        opFinal = getOp();

        // Estrutura switch que executa um bloco de código específico dependendo do valor de 'opFinal'
        switch (opFinal){
            case 1:
                // Cria um objeto da classe 'Faxineiro' e executa o método 'baterPonto()'
                Faxineiro faxineiro = new Faxineiro();
                faxineiro.baterPonto();
                break;
            case 2:
                // Cria um objeto da classe 'Vendedor', executa o método 'baterPonto()', 'venda()' e 'fechaCaixa()'
                Vendedor vendedor = new Vendedor();
                vendedor.baterPonto();
                vendedor.venda();
                vendedor.fechaCaixa();
                break;
            case 3:
                // Cria um objeto da classe 'Gerente' e executa o método 'baterPonto()' e 'solicitarMaterial()'
                Gerente gerente = new Gerente();
                gerente.baterPonto();
                gerente.solicitarMaterial();
                break;
            default:
                // Se nenhuma das opções acima for escolhida, imprime uma mensagem de saída do sistema
                System.out.println("Você saiu do sistema");
                break;
        }
    }
}
