package Negocio;

public class Carrinho {
	//propriedades da classe
	private Produto[] colecaoProduto= new Produto[100] ;
	private Cliente objCliente= null;
	private String cartao="";
	private int indice = 0; 
	
			
	// Métodos construtores da classe
	public Carrinho() {
		}
	public Carrinho(Cliente objCliente, String cartao) {
		this.colecaoProduto = colecaoProduto;
		this.objCliente= objCliente;
		this.cartao= cartao;
		
		}
	//metodos get/set da classe
	public Produto[] getColecaoProduto() {
		return colecaoProduto;
	}
	public void setColecaoProduto(Produto[] colecaoProduto) {
		this.colecaoProduto = colecaoProduto;
	}
	public Cliente getObjCliente() {
		return objCliente;
	}
	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	//Metodos da classe
	public void adicionarProdutoNoCarrinho(Produto objProduto) {
		if (indice < 100) {
			colecaoProduto[indice] = objProduto;
			indice++;
		}
	}
		
	public void listarProdutosDoCarrinho() {
		for (int i = 0; i < indice; i++) {
			System.out.println(colecaoProduto[i].getDescricao() + " " + colecaoProduto[i].getValor());
		}
	}
	
	public double calcularValorTotal() {
		double retorno =0;
		for (int i = 0; i < indice; i++) {

		retorno = retorno + colecaoProduto[i].getValor() ;
	}
		return retorno;
		
}
}