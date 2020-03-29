package Produto;

import java.util.ArrayList;

public class ProdutoControlador {
	private ManipularProduto repositorio;
	
	public boolean exists(Produto produto) { 
	int a =  repositorio.ConsultarProduto(produto).size();
		 if (a==0) {
			 return true;
		 }
		 else return false;
	}
	
	public ArrayList<Produto> ConsultarProduto(Produto produto) {
		return repositorio.ConsultarProduto(produto);
	}
	
	public boolean inserirProduto(Produto produto) {
		if (exists(produto)) {
		boolean novoproduto = repositorio.inserirProduto(produto);
		if (novoproduto) {
			return true;
		} else return false;
		}
		else {return false;}
	}

			
		
	public boolean excluirProduto(Produto produto) {
		if (exists(produto)) {
			boolean excluirproduto = repositorio.excluirProduto(produto);
			if (excluirproduto) {
				return true;
			} else 
				return false;
			
		}
			

	public	boolean alterarProduto (Produto produto1) {
			if (exists(produto1)) {
			boolean alterarproduto = repositorio.alterarProduto(produto1);
	      	if (alterarproduto) {
			return true;
			} else 
			return false;
				
			}
			
		}
		return repositorio.excluirProduto(produto1);
	}
	
	public ProdutoControlador() {
		repositorio = ProdutoRepositorioList.getInstance();
	}

	public void alterarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	
}
