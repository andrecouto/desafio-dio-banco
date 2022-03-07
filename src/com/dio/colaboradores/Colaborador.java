package com.dio.colaboradores;

import java.util.List;
import com.dio.instituicao.Conta;

public class Colaborador {
	protected String nome;
	protected List <Conta> listaContas;
	
	public void adicionaConta(Conta conta) {
		listaContas.add(conta);
	}
}
