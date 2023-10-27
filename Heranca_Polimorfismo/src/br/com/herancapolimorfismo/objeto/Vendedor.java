package br.com.herancapolimorfismo.objeto;

public class Vendedor extends Funcionario {


    @Override
    public void baterPonto() {
        super.baterPonto();
    }

    //vendedor faaz a venda
    public void venda(){
        super.venda();
    }

    //vendedor fecha o caixa
    @Override
    public void fechaCaixa() {
        super.fechaCaixa();
    }
}
