package pedido;

import java.time.LocalDate;

import pedido.analise.SituacaoPedido;

public class Pedido {

	private SituacaoPedido situacaoPedido;
	private double valor;
	private String descricao;
	private LocalDate previsaoDataEntrega = LocalDate.now().plusDays(6);

	public Pedido(SituacaoPedido situacaoPedido, double valor, String descricao) {
		super();
		this.situacaoPedido = situacaoPedido;
		this.valor = valor;
		this.descricao = descricao;
	}

	public SituacaoPedido getSituacaoPedido() {
		return situacaoPedido;
	}

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getPrevisaoDataEntrega() {
		return previsaoDataEntrega;
	}

	public void setPrevisaoDataEntrega(LocalDate previsaoDataEntrega) {
		this.previsaoDataEntrega = previsaoDataEntrega;
	}

	public void setSituacaoPedido(SituacaoPedido situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
	}

}
