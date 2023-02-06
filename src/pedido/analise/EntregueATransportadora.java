package pedido.analise;

import java.time.LocalDate;

import pedido.Pedido;

public class EntregueATransportadora extends SituacaoPedido{

	@Override
	public void atualizarPrevisaoEntrega(Pedido pedido) {
		pedido.setPrevisaoDataEntrega(LocalDate.now().plusMonths(3) );
	}
	
	@Override
	public void proximaFase(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(new SairParaEntrega());
	}
	
	@Override
	public void cancelar(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(null);
	}

}
