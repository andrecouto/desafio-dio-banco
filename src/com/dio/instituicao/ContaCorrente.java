package com.dio.instituicao;

import com.dio.colaboradores.Cliente;

public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public ContaCorrente(Cliente cliente, int agencia) {
		super(cliente, agencia);
	}
}
