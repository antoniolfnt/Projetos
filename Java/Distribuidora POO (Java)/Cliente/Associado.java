package Cliente;
import java.sql.Date;

import Util.ConsoleInterface;
import Util.InterfaceUsuario;

public abstract class Associado {
	private InterfaceUsuario interfaceUsuario;
	private String nome;
	private int cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcpf() {
		return cpf;
	}

	public void setcpf(int cpf) {
		this.cpf = cpf;
	}

	public Associado() {
		this.nome = "";
		interfaceUsuario = new ConsoleInterface();
	}

	public Associado(InterfaceUsuario interfaceUsuario, String nome) {
		this.interfaceUsuario = interfaceUsuario;
		this.nome = nome;
	}

	public Associado(InterfaceUsuario interfaceUsuario, String nome, int cpf) {
		this.interfaceUsuario = interfaceUsuario;
		this.nome = nome;
		this.cpf = cpf;
}

	public abstract void listarProduto();
}