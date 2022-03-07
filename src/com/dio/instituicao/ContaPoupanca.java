package com.dio.instituicao;

import com.dio.colaboradores.Cliente;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public ContaPoupanca(Cliente cliente, int agencia) {
		super(cliente, agencia);
	}
	
}
