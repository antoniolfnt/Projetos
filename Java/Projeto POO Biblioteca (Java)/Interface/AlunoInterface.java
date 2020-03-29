package Interface;

import java.util.List;
import associado.Livro;

public interface AlunoInterface {
        public boolean inserir(Livro livro);
	public boolean alterar(Livro livro);
	public boolean excluir(Livro livro);
        public List<Livro> consultar (Livro livro);
}
