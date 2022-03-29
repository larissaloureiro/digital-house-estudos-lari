package aulaPOOBanco;

public class PessoaHeranca {
	private String nome;
	private String email;
	private String telefone;
	
	
	//Construtores
	public PessoaHeranca() {
		//método construtor default = preenchimento dos atributos é opcional.
	}
		
	public PessoaHeranca(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
}
