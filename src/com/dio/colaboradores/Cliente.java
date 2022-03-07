package com.dio.colaboradores;

public class Cliente extends Colaborador {
protected int cpf;
	
	public Cliente(int cpf) {
		setCpf(cpf);
	}
	
	public int getCpf() {
		return cpf;
	}
	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
