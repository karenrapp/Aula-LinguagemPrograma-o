package Apresentacao;

import Negocio.Carrinho;
import Negocio.Cliente;
import Negocio.Produto;

public class Principal {
	public static void main (String[] args) {
		Carrinho objCarrinho = new Carrinho();
		
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Sapato", 500));
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Casaco", 2000));
	
		objCarrinho.listarProdutosDoCarrinho();
		System.out.println("Valor total: R$ " + objCarrinho.calcularValorTotal());
		
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Livro", 100));
		
		objCarrinho.listarProdutosDoCarrinho();
		System.out.println("Valor total: R$ " + objCarrinho.calcularValorTotal());
		
		Cliente objCliente = new Cliente("699", "Junior", "SQS 207");
		objCarrinho.setObjCliente(objCliente);
		objCarrinho.setCartao("4984");
		
		System.out.println(objCarrinho.getObjCliente().getNome());
		
	}
}
