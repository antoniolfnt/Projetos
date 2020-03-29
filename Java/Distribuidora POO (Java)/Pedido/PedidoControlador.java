package Pedido;


import java.util.ArrayList;

import Pedido.ManipularPedido;
import Pedido.Pedido;
import Pedido.PedidoRepositorioList;

	public class PedidoControlador {
		private ManipularPedido repositorio;
		
		public boolean exists(Pedido pedido) {
			return repositorio.ConsultarPedido(pedido).size()>0;
		}
		
		public ArrayList<Produto> ConsultarPedido(Pedido Pedido) {
			return repositorio.ConsultarPedido(Pedido);
		}
		
		public boolean inserirPedido(Pedido Pedido) {
			if (!exists(Pedido)) {
				return repositorio.inserirPedido(Pedido);
			}else {
				return false;
				//sysout;
			}
		}
		public boolean excluirPedido(Pedido Pedido) {
			return repositorio.excluirPedido(Pedido);
		}
		
		public PedidoControlador() {
			repositorio = PedidoRepositorioList.getInstance();
		}
		
	}


