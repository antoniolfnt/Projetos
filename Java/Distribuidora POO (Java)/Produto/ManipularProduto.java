package Produto;

import java.util.ArrayList;

public interface ManipularProduto {
	public boolean inserirProduto(Produto produto);
	public boolean alterarProduto(Produto produto);
	public boolean excluirProduto(Produto produto);
	ArrayList<Produto> ConsultarProduto(Produto produto);
}
