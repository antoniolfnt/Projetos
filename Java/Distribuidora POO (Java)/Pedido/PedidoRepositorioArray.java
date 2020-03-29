package Pedido;

import java.util.ArrayList;

public class PedidoRepositorioArray implements ManipularPedido{
	
	private static PedidoRepositorioArray instance;
	private PedidoRepositorioArray() {}
	public static PedidoRepositorioArray getInstance() {
		if(instance == null) {
			synchronized(PedidoRepositorioArray.class) {
				if(instance == null) {
					instance = new PedidoRepositorioArray();
				}
			}
		}
		return instance;
	}

	Pedido Pedido[];
	@Override
	public boolean inserirPedido(Pedido pedido) {
      return false;
	}

	@Override
	public boolean alterarPedido(Pedido pedido) {
       return false;
	}

	@Override
	public boolean excluirPedido(Pedido pedido) {
		
		return false;
	}
	@Override
	public ArrayList<Pedido> ConsultarPedido(Pedido pedido) {
		
		return null;
	}

}