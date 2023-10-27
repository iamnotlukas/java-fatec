package br.com.herancapolimorfismo.objeto;

import java.util.Scanner;

public class Gerente extends Funcionario {

    Scanner ler = new Scanner(System.in);
    @Override
    public void baterPonto() {
        super.baterPonto();
    }

    @Override
    public void solicitarMaterial() {
        super.solicitarMaterial();
        int op2 = ler.nextInt();
        if (op2 == 1){
            System.out.println("""
                    Foi solicitado Cimento.
                    Cimento chegando no local...
                    Cimento chegou.""");
        }
        else{
            System.out.println("""
                    Foi solicitado Areia.
                    Areia chegando no local
                    Areia chegou.
                    """);
        }

    }
}
