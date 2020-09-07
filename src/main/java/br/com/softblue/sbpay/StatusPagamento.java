package br.com.softblue.sbpay;

public enum StatusPagamento {
	
	Autorizado("Autorizado"),
	NaoAutorizado("Não auturizado pela instituição financeira"),
	CartaoInvalido("Cartão inválido ou bloqueado");
	
	String descricao;
	
	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
