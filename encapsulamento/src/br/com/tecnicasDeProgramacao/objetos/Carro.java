package br.com.tecnicasDeProgramacao.objetos;
import br.com.tecnicasDeProgramacao.principal.Main;

import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    private boolean motor;

    private double velocidade;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    private int capacidade;


    public double getValorGalina() {
        return ValorGalina;
    }

    public void setValorGalina(double valorGalina) {
        ValorGalina = valorGalina;
    }

    private double ValorGalina;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void Perguntar(){
        Scanner ler = new Scanner (System.in);
        System.out.print("Informe o valor da gasolina: ");
    }


    public void CalcularValorTotal (double ValorGasolina, int capacidade){
        double ValorTotal =  ValorGasolina * capacidade;
        System.out.println("Você precisa comprar " + ValorTotal + " de gasolina");
    }

    public void LigareDesligar(boolean Motor){
        if(isMotor()){
            System.out.println("Ligando carro Vrum Vrummmmm");
        }
        else{
            System.out.println("Carro desligado ... Drum drummm");
            setMotor(true);

        }
    }

    public void Vrum(){
        System.out.println("Acelerando seu carro...");
        for(int i = 0; i <=180; i++){
            System.out.println("Velocidade atual: " + i);
        }
        System.out.println("Chegou no limite de velocidade!");
        System.out.println("Estamos desacelerando...");
        for(int i = 180; i >= 0; i --){
            System.out.println("Velocidade atual: "+ i);
        }
    }



}


//Evolua o conceito do exercício da entidade Carro
// defina 1 método para calcular o valor total  para
// encher o tanque. Este deve receber como parâmetro o
// valor da gasolina, faça a lógica para ligar
// (se tiver motor e estiver desligado) e desligar
// o carro, faça a lógica para
// acelerar e frear o Carro até a capacidade do Carro (0 à 180);
