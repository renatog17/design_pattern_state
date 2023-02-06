package pedido.analise;

import java.time.LocalDate;

import pedido.Pedido;

public class SairParaEntrega extends SituacaoPedido{

	@Override
	public void atualizarPrevisaoEntrega(Pedido pedido) {
		pedido.setPrevisaoDataEntrega(LocalDate.now().plusDays(1));
		
	}
	
	@Override
	public void proximaFase(Pedido pedido) throws Exception {
		pedido.setSituacaoPedido(new EntregueAoCliente());
	}

}
