package pedido.analise;

import pedido.Pedido;

public abstract class SituacaoPedido {

	public abstract void atualizarPrevisaoEntrega(Pedido pedido);
	
	public void proximaFase(Pedido pedido) throws Exception {
		throw new Exception("Pedido não pode seguir para a próxima fase");
	}
	
	public void cancelar(Pedido pedido) throws Exception {
		throw new Exception("Pedido não pode ser cancelado");
	}
	
	public void finalizar(Pedido pedido) throws Exception {
		throw new Exception("Pedido não pode ser finalizado");
	}
}
