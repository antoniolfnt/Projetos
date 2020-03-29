package Pedido;

import java.util.ArrayList;

import Pedido.ManipularPedido;

public class PedidoRepositorioList implements ManipularPedido {
	private static PedidoRepositorioList instance;
	private ArrayList<Pedido> Pedido;
	private PedidoRepositorioList() {
		Pedido = new ArrayList<Pedido>();
	}
	public static synchronized PedidoRepositorioList getInstance() {
		if(instance == null) {
			instance = new PedidoRepositorioList();
		}
		return instance;
	}

	@Override
	public boolean inserirPedido(Pedido produto) {
		
	return pedido.add(produto);
	}

	@Override
	public boolean alterarPedido(Pedido produto) {
		return pedido.add(produto);
	}

	@Override
	public boolean excluirPedido(Pedido Produto) {
		for (int i=0; i<pedido.size();i++) {
			if (pedido.get(i).getNome().compareToIgnoreCase(pedido.getNome())==0) {
				pedido.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public ArrayList<pedido> Consultarpedido(pedido pedido) {
		ArrayList<pedido> pedidoRetorno = new ArrayList<pedido>();
		if (pedido.getId()>0) {
			for (int i=0; i<pedido.size();i++) {
				if (pedido.get(i).getId()==pedido.getId()) {
					pedidoRetorno.add(pedido.get(i));
				}
			}
			return pedidoRetorno;
		}
		return pedidoRetorno;

	}
	
}

