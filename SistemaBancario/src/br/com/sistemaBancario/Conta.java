package br.com.sistemaBancario;

public class Conta {
	
	private String nome;
	private int numConta;
	private double saldo;
	private int tipo;
	private double limite;
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	//metodo construtor 
	public Conta(String nome, int numConta, double saldo) {
		
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}


	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	
	
	public void Saque(double valorSacar) {
		
	
		
		if(valorSacar > getSaldo() + getLimite()){
			System.out.println("Saldo + Limite insuficiente");
		}
		else {
			if (getTipo() == 1) {
				System.out.println("Você não pode sacar, sua conta é poupança");
			}
			else {
				System.out.println("Saque sendo realizado...");
				double newSaldo = getSaldo() - valorSacar;
				newSaldo = setSaldo(newSaldo);
				System.out.println("Saque realizado com sucesso \n"
						+ "Saldo atual: " + getSaldo() + "\nSaldo + Limite: " + (getSaldo() + getLimite()));
				
			}
			
		}
		
	}

	public void Deposito(double valorDepositar) {

		
		if(valorDepositar > getSaldo()){
			System.out.println("Saldo insuficiente");
		}
		else {
			
				System.out.println("Deposito sendo realizado...");
				double newSaldo = getSaldo() + valorDepositar;
				newSaldo = setSaldo(newSaldo);
				System.out.println("Deposito realizado com sucesso \n"
						+ "Saldo atual: " + getSaldo() + "\nSaldo + Limite: " + (getSaldo() + getLimite()));
				
			
			
		}
	}

	public void Transferencia(double valorTransferir) {
	
		
		
		if(valorTransferir > getSaldo()){
			System.out.println("Saldo insuficiente");
		}
		else {
			
				System.out.println("Transferência sendo realizada...");
				double newSaldo = getSaldo() - valorTransferir;
				newSaldo = setSaldo(newSaldo);
				System.out.println("Transferencia realizada com sucesso para a conta " + "\n"
						+ "Saldo atual: " + getSaldo());
				
			
			
		}
	}


	




}
