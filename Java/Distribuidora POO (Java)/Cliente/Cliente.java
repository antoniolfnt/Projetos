package Cliente;
import java.sql.Date;

import Util.InterfaceUsuario;
import Util.TipoMensagem;

public class Cliente extends Associado{

	public Cliente(InterfaceUsuario interfaceUsuario, String nome){
		super(interfaceUsuario, nome);
	}

	public Cliente(InterfaceUsuario interfaceUsuario, String nome, Date dataNascimento) {
		//super(interfaceUsuario, nome, dataNascimento);
	}

	public void listarProdutos() {
		//interfaceUsuario.exibirMensagem("Listando as disciplinas matriculadas por "+this.getNome(), TipoMensagem.Alerta);		
	}

	@Override
	public void listarProduto() {
		// TODO Auto-generated method stub
		
	}
}
