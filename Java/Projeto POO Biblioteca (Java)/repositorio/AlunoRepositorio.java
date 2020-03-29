package repositorio;

import java.util.ArrayList;
import java.util.List;

import associado.Livro;
import associado.Aluno;


public class AlunoRepositorio {
    private static AlunoRepositorio instance;
    private final ArrayList<Aluno> aluno;
    //construtor privado
	private AlunoRepositorio() {
		aluno = new ArrayList<>();
        }
    //metodo publico
	public static synchronized AlunoRepositorio getInstance() {
		if(instance == null) {
			instance = new AlunoRepositorio();
		}
		return instance;
        }
    public boolean pegarLivro(Livro livro) {
		// return livro.add(livro);
    }
    public boolean devolverLivro(Livro livro) {
		// return livro.remove(livro);
    }
    public List<Livro> consultar(Livro livro) {
        ArrayList<Aluno> LivroRetorno;
        LivroRetorno = new ArrayList<Livro>();
    if (Livro.getId()>0) {
			for (int i=0; i<Livro.size();i++) {
				if (Livro.get(i).getId()==Livro.getId()) {
                                    LivroRetorno.add(Livro.get(i));
                                }
    }
                        return LivroRetorno;
                return Livro;
    
}
        
