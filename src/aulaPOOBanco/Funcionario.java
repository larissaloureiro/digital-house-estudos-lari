package aulaPOOBanco;

public class Funcionario {
//	Crie uma nova Classe chamada Funcionário com os seguintes atributos: nome, cpf. ctps, dataAdmissao, salario
	String nome;
	String cpf;
	String ctps;
	String dataAdmissao;
	double salario;
	
	// Construtores
	public Funcionario() {
		
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
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
