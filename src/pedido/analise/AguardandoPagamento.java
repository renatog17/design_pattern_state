package pedido.analise;

import java.time.LocalDate;

import pedido.Pedido;

public class AguardandoPagamento extends SituacaoPedido {

	@Override
	public void atualizarPrevisaoEntrega(Pedido pedido) {
		pedido.setPrevisaoDataEntrega(LocalDate.now().plusDays(4));	
	}
	
	@Override
	public void proximaFase(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(new EntregueATransportadora());
	}
	
	@Override
	public void cancelar(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(null);
	}

	
}
