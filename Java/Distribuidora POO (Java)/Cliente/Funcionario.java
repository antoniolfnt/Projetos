package Cliente;

import Util.*;

public class Funcionario extends Associado{

	public Funcionario(InterfaceUsuario interfaceUsuario, String nome){
		super(interfaceUsuario, nome);
	}

	public Funcionario(InterfaceUsuario interfaceUsuario, String nome, int cpf) {
		super(interfaceUsuario,nome, cpf);
	}

	@Override
	public void listarProduto() {
		interfaceUsuario.exibirMensagem("Listando os produtos para, "+this.getNome(), TipoMensagem.Informacao);
	}		
}
