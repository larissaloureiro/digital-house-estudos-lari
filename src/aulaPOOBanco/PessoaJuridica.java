package aulaPOOBanco;

public class PessoaJuridica extends PessoaHeranca {
	private String cnpj;
	private String segmento;
	private String responsavel;
	
	
	// Construtores
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cnpj, String segmento, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}
	
	// Getters & Setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
}
