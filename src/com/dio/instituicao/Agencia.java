package com.dio.instituicao;

public class Agencia {
	protected String uf;
	protected String cidade;
	protected String logradouro;
	protected int numeroRua;
	protected int cep;
	protected int numeroAgencia;
	
	public Agencia() {
		
	}
	public Agencia(int agencia) {
		 this.numeroAgencia = agencia;
		 this.uf = "";
		 this.cidade = "";
		 this.logradouro = "";
		 this.numeroRua = 0;
		 this.cep = 0;
	}
	
	public String getUf() {
		return uf;
	}
	public String getCidade() {
		return cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumeroRua() {
		return numeroRua;
	}
	public int getCep() {
		return cep;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	
	 
}
