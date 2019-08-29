package Negocio;

public class Produto {
	//propriedades da classe
		private String descricao= "";
		private double valor=0;
		
		// Métodos construtores da classe
		public Produto() {
		}
		public Produto(String descricao, double valor) {
			this.descricao = descricao;
			this.valor = valor;
		}
		
		//Metodo get set da classe
		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao=descricao;
		}
	
		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor=valor;
		}
		
		
}
