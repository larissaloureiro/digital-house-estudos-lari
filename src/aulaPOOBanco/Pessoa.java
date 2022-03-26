package aulaPOOBanco;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String profissao;
	private String email;
	private String telefone;
	
	
	//Construtores
	public Pessoa() {
		//método construtor default = preenchimento dos atributos é opcional.
	}
	
	public Pessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
		
	public Pessoa(String nome, String cpf, String rg, String profissao, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
