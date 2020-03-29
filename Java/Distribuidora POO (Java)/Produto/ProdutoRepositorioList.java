package Produto;

import java.util.ArrayList;

public class ProdutoRepositorioList implements ManipularProduto {
	private static ProdutoRepositorioList instance;
	private ArrayList<Produto> produto;
	private ProdutoRepositorioList() {
		produto = new ArrayList<Produto>();
	}
	public static synchronized ProdutoRepositorioList getInstance() {
		if(instance == null) {
			instance = new ProdutoRepositorioList();
		}
		return instance;
	}

	@Override
	public boolean inserirProduto(Produto disciplina) {
		
	return produto.add(disciplina);
	}

	@Override
	public boolean alterarProduto(Produto disciplina) {
		return produto.add(disciplina);
	}

	@Override
	public boolean excluirProduto(Produto produto) {
		for (int i=0; i<produto.size();i++) {
			if (produto.get(i).getNome().compareToIgnoreCase(produto.getNome())==0) {
				produto.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public ArrayList<Produto> ConsultarProduto(Produto produto) {
		ArrayList<Produto> produtoRetorno = new ArrayList<Produto>();
		if (produto.getId()>0) {
			for (int i=0; i<produto.size();i++) {
				if (produto.get(i).getId()==produto.getId()) {
					produtoRetorno.add(produto.get(i));
				}
			}
			return produtoRetorno;
		}
		return produtoRetorno;

	}
	
}
