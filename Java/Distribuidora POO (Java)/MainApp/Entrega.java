package MainApp;

import java.util.Scanner;

import Cliente.*;
import Produto.ProdutoControlador;
import Produto.Produto;
import Cliente.Associado;
import Util.ConsoleInterface;
import Util.InterfaceUsuario;

public class Entrega {
	public static void main(String[] args) {
		InterfaceUsuario menu = new ConsoleInterface();
		System.out.println("Bem vindo a Distribuidora !");
		System.out.println("Selecione uma opção :");
		String opcoesMenu[] = { "1. Inserir produto", "2. Retirar produto", "3. Alterar produto" };
		menu.construirOpcoesMenu(opcoesMenu);
		Scanner input = new Scanner(System.in);
		int menuu = input.nextInt();
		if (menuu == 1) {
			System.out.println("Insira nº produto (1-3)");
			int pdt = input.nextInt();
			ProdutoControlador dc = new ProdutoControlador();
			switch (pdt) {
			case 1:
				Produto produto = new Produto();
				produto.setId(1);
				produto.setNome("Produto1");
				dc.inserirProduto(produto);
				if (dc.inserirProduto(produto)==true) {
					System.out.println("Produto Inserido");
				} else {
					System.out.println("Produto não Inserido");
				}
				break;
			case 2:
				Produto produt = new Produto();
				produt.setId(2);
				produt.setNome("Produto2");
				dc.excluirProduto(produt);
				if (dc.excluirProduto(produt)==true) {
					System.out.println("Excluir produto");
				} else {
					System.out.println("Excluir produto");
				}
				break;

			case 3:
				dc.inserirProduto(new Produto(3, "Produto3"));
				break;
			default:
			}
		}
	}
}