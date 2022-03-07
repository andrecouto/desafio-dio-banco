package com.dio.colaboradores;

public class Acionista extends Colaborador {
	protected int cnpj;
	
	public Acionista(int cnpj) {
		setCnpj(cnpj);
	}
	
	public int getCnpj() {
		return cnpj;
	}
	protected void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
