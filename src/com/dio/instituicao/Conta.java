package com.dio.instituicao;

import com.dio.colaboradores.Cliente;

public class Conta {
	
	private static int SEQUENCIAL = 1;
	private static int AGENCIA = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo = 0;
	protected Cliente cliente;
	protected Fatura fatura;
	
	
	public Conta(Cliente cliente) {
		setAgencia(AGENCIA);
		setConta(SEQUENCIAL);
		setCliente(cliente);
		SEQUENCIAL++;		
	}
	
	public Conta(Cliente cliente, int ag) {
		setAgencia(ag);
		setConta(SEQUENCIAL);
		setCliente(cliente);
		SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}

	private void setAgencia(int ag) {
		this.agencia = ag;
	}

	public int getConta() {
		return conta;
	}

	private void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	private int validaValor(double valor) {
		if(valor <= 0) {
			System.out.println("\n\nValor incorreto.\nFaça a transação novamente.\n\n");
			return 0;
		}else if(saldo >= valor) {
			return 1;
		}else {
			System.out.println("\n\nValor incorreto.\nFaça a transação novamente.\n\n");
			return 0;
		}
	}
	
	public void sacar(double valor) {
		if(validaValor(valor) == 1) {
			saldo -= valor;
			//transação
			Transacao transacao = new Transacao(this.conta, valor);
			fatura.afetuarTransacao(transacao);
		}else {
			System.out.println("\n\nValor incorreto.\nFaça a transação novamente.\n"
					+ "Saldo atual: R$" + this.saldo + "\n\n");			
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		//transacao
		Transacao transacao = new Transacao(this.conta, valor, true);
		fatura.afetuarTransacao(transacao);
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if(validaValor(valor) == 1) {
			contaDestino.saldo += valor;
			this.saldo -= valor;
			//transacao
			Transacao transacao = new Transacao(this.conta, contaDestino.conta, "Transferencia", valor);
			fatura.afetuarTransacao(transacao);
		}
	}
	
	public Fatura gerarFatura() {
		return fatura;
	}
	
}
