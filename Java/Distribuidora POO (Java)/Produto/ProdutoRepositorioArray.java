package Produto;

import java.util.ArrayList;

public class ProdutoRepositorioArray implements ManipularProduto{
	private static ProdutoRepositorioArray instance;
	private ProdutoRepositorioArray() {}
	public static ProdutoRepositorioArray getInstance() {
		if(instance == null) {
			synchronized(ProdutoRepositorioArray.class) {
				if(instance == null) {
					instance = new ProdutoRepositorioArray();
				}
			}
		}
		return instance;
	}

	Produto produto[];
	@Override
	public boolean inserirProduto(Produto produto) {
      return false;
	}

	@Override
	public boolean alterarProduto(Produto produto) {
       return false;
	}

	@Override
	public boolean excluirProduto(Produto produto) {
		
		return false;
	}
	@Override
	public ArrayList<Produto> ConsultarProduto(Produto produto) {
		
		return null;
	}

}