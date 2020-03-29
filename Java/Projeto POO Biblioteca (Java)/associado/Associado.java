package associado;

public abstract class Associado {    
        private int matricula;
        private String nome;
        private boolean ativo;

    public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Associado() {
        this.setNome("");
        this.setMatricula(0);
    }
    public Associado(String nome, int matricula) {
        this.setNome(nome);
        this.setMatricula(0);
    

    }
}

