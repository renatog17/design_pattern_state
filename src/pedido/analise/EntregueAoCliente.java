package pedido.analise;

import java.time.LocalDate;

import pedido.Pedido;

public class EntregueAoCliente extends SituacaoPedido{

	@Override
	public void atualizarPrevisaoEntrega(Pedido pedido) {
		pedido.setPrevisaoDataEntrega(LocalDate.now().plusDays(0));
	}

	@Override
	public void finalizar(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(new EntregueAoCliente());
	}
}
