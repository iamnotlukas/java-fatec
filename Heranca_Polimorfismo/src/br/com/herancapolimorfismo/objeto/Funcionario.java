package br.com.herancapolimorfismo.objeto;

public class Funcionario {
    private String cdFuncionario;

    // Método getter que retorna o código do funcionário
    public String getCdFuncionario() {
        return cdFuncionario;
    }

    // Método que representa a ação de bater o ponto
    public void baterPonto(){
        System.out.println("Ponto batido");
    }

    // Método que representa a ação de fechar o caixa
    public void fechaCaixa(){
        System.out.println("Fechando caixa...");
    }

    // Método que representa a ação de realizar uma venda
    public void venda(){
        System.out.println("""
                            Realizando venda...
                            VENDA REALIZADA COM SUCESSO!""");
    }

    // Método que representa a ação de solicitar um material
    public void solicitarMaterial(){
        System.out.println("""
                Informe a numeração do material:
                1 - Cimento
                2 - Areia""");
    }
}
