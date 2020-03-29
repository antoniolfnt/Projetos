package Util;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowsInterface implements InterfaceUsuario {
	@Override
	public void construirOpcoesMenu(String opcoes[]) {
		for (int i=0;i<opcoes.length;i++) {
			System.out.println(opcoes[i]);
		}		
	}

	@Override
	public void exibirMensagem(String msg, TipoMensagem tipoMensagem) {
		JFrame frame = new JFrame("JOptionPane exemplo");
		if (tipoMensagem == TipoMensagem.Alerta) {
			JOptionPane.showMessageDialog(frame, msg, "Atenção", JOptionPane.WARNING_MESSAGE);
		}else if (tipoMensagem == TipoMensagem.Informacao) {
			JOptionPane.showMessageDialog(frame, msg, "Alerta", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(frame, msg);
		} 
	    System.exit(0);
	}

}
