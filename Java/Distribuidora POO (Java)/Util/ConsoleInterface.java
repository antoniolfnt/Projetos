package Util;

public class ConsoleInterface implements InterfaceUsuario {

	@Override
	public void construirOpcoesMenu(String opcoes[]) {
		for (int i=0;i<opcoes.length;i++) {
			System.out.println(opcoes[i]);
		}		
	}

	@Override
	public void exibirMensagem(String msg, TipoMensagem tipoMensagem) {
		if (tipoMensagem == TipoMensagem.Alerta) {
			System.out.println("ALERTA");
		}else if (tipoMensagem == TipoMensagem.Informacao) {
			System.out.println("ATENÇÃO");
		}
		System.out.println(msg);
	}

}
