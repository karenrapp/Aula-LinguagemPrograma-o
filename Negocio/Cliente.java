	package Negocio;

public class Cliente {
	//propriedades da classe
	private String cpf ="";
	private String nome= "";
	private String endereco="";
	
	// Métodos construtores da classe
	public Cliente() {
	}
	public Cliente(String cpf, String nome, String endereco) {
		this.cpf= cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//Metodo get set da classe
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf=cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getEndereco() {
		return endereco;
		}

	public void setEndereco(String endereco) {
		this.endereco=endereco;
	
	}

}
