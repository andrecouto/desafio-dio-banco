package com.dio.instituicao;

import java.util.List;

public class Fatura {
	protected List<Transacao> listaTransacao;
	
	public Fatura() {
		
	}
	
	public void afetuarTransacao(Transacao transacao) {
		listaTransacao.add(transacao);
	}
}
