package Produto;

import java.util.ArrayList;

public class ManipularProdutoImpl implements ManipularProduto {

	@Override
	public boolean inserirProduto(Produto produto) {
		if (produto.getId() != 0 && produto.getNome() != "") {
			return true;
		} else
			return false;
	}

	@Override
	public boolean alterarProduto(Produto produto) {
		if (produto.getId() !=0 && produto.getNome() != "") {
			return true;
		} else
			return false;
	}

	@Override
	public boolean excluirProduto(Produto produto) {
		if (produto.getId() !=0 && produto.getNome() != "") {
			return true;
		} else
			return false;
	}
		

	@Override
	public ArrayList<Produto> ConsultarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

}
