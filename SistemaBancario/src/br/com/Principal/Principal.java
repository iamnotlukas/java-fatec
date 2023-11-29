package br.com.Principal;

import br.com.sistemaBancario.Conta;
import br.com.boasPraticas.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta("Lucas", 12, 4500);
		Entrada entrada = new Entrada();
		Scanner ler = new Scanner(System.in);
		
		entrada.informarTipo();		
		conta.setTipo(ler.nextInt());
		entrada.informarLimite();
		conta.setLimite(ler.nextDouble());
		
		
		if(conta.getTipo() == 1) {
			 entrada.opBanco();
			 int op = ler.nextInt();
			 switch(op) {
			 case 1:
				 //saque poupanca
				 System.out.println("-------------------------------\nSistema de Saque \n---------------------");
					System.out.println("Seu saldo é: " + conta.getSaldo() + 
							"\nInforme o valor que deseja sacar: ");
					double valorSacar = ler.nextDouble();
				 conta.Saque(valorSacar);
				 break;
				 
			 case 2: //edposito poupanca
				 System.out.println("-------------------------------\nSistema de Deposito \n---------------------");
					System.out.println("Seu saldo é: " + conta.getSaldo() + 
							"\nInforme o valor que deseja depositar: ");
					double valorDepositar = ler.nextDouble();
					 conta.Saque(valorDepositar);
					 break;
				 
			 case 3: //tranferencia poupanca
					System.out.println("-------------------------------znSistema de Transferencia \n---------------------");
					System.out.println("Seu saldo é: " + conta.getSaldo() + 
							"\nInforme o valor que deseja transferir: ");
					double valorTransferir = ler.nextDouble();
					conta.Transferencia(valorTransferir);
				 
				 
			 }
			 
			
			 
		
		}
		else if (conta.getTipo() == 2) {
			 entrada.opBanco();
			 int op2 = ler.nextInt();
			
			switch(op2) {
			case 1: //saque corernte
				System.out.println("Sistema de Saque \n---------------------");
				System.out.println("Seu saldo é: " + conta.getSaldo() + 
						"\nInforme o valor que deseja sacar: ");
				double valorSacar = ler.nextDouble();
			 conta.Saque(valorSacar);
			 break;
			 
			case 2: 
				//deposito poupança
				 System.out.println("Sistema de Deposito \n---------------------");
					System.out.println("Seu saldo é: " + conta.getSaldo() + 
							"\nInforme o valor que deseja depositar: ");
					double valorDepositar = ler.nextDouble();
					 conta.Saque(valorDepositar);
					 break;
			case 3: 
				 //tranferencia poupanca
				System.out.println("Sistema de Transferencia \n---------------------");
				System.out.println("Seu saldo é: " + conta.getSaldo() + 
						"\nInforme o valor que deseja transferir: ");
				double valorTransferir = ler.nextDouble();
				conta.Transferencia(valorTransferir);
				
			}
		
		}
		
		
		
		
	}

}
