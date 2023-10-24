package br.com.tecnicasDeProgramacao.principal;
//Evolua o conceito do exercício da entidade Carro
// defina 1 método para calcular o valor total  para
// encher o tanque. Este deve receber como parâmetro o
// valor da gasolina, faça a lógica para ligar
// (se tiver motor e estiver desligado) e desligar
// o carro, faça a lógica para
// acelerar e frear o Carro até a capacidade do Carro (0 à 180);

import br.com.tecnicasDeProgramacao.objetos.Carro;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    Scanner ler = new Scanner (System.in);

        //declarando o objeto
        Carro carroZika = new Carro();
        carroZika.setValorGalina(5.40);
        carroZika.setMotor(true);

        //bloco de código para perguntar informações sobre o código
        System.out.println("Informe a Marca do carro: ");
        carroZika.setMarca(ler.next());
        System.out.println("Informe o modelo do carro: ");
        carroZika.setModelo(ler.next());
        System.out.println("Informe o ano do carro: ");
        carroZika.setAno(ler.nextInt());


        //exibir ao usuario as informações
        System.out.println("O carro que está sendo utilizado é o: " + carroZika.getMarca() + " "+
                carroZika.getModelo() + " do ano " + carroZika.getAno());

        //chamando a função para perguntar a capacidade do carro
        carroZika.Perguntar();
        carroZika.setCapacidade(ler.nextInt());

        //chamando a função para calcuar o valor total para preencher a capacidade do carro
        carroZika.CalcularValorTotal(carroZika.getValorGalina(), carroZika.getCapacidade());

        //chamando o método  de Ligar e Deligar carro
        carroZika.LigareDesligar(carroZika.isMotor());

        //chamando o método de aceleração e desaceleração
        carroZika.Vrum();



    }
}
