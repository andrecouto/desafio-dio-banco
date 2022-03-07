package com.dio.instituicao;

public class Transacao {
	protected int contaOrigem;
	protected int contaDestino;
	protected String tipoTransacao;
	protected double valor;
	
	//Pagamento/Saque
	public Transacao(int contaOrigem, double valor) {
		setContaOrigem(contaOrigem);
		setValor(valor);
		setContaDestino(-1);
		setTipoTransacao("Pagamento/Saque");
	}
	
	//Recebimento/Deposito
	public Transacao(int contaDestino, double valor, boolean entrada ) {
		setContaDestino(contaDestino);
		setValor(valor);
		setContaOrigem(-1);
		setTipoTransacao("Recebimento/Deposito");
	}
	
	public Transacao(int contaOrigem, int contaDestino, String tipoTransacao, double valor) {
		setContaDestino(contaDestino);
		setContaOrigem(contaOrigem);
		setTipoTransacao(tipoTransacao);
		setValor(valor);
	}
	

	public int getContaOrigem() {
		return contaOrigem;
	}

	private void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public int getContaDestino() {
		return contaDestino;
	}

	private void setContaDestino(int contaDestino) {
		this.contaDestino = contaDestino;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	private void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public double getValor() {
		return valor;
	}

	private void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
