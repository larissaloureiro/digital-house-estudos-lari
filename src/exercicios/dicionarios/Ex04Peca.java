package exercicios.dicionarios;

public abstract class Ex04Peca {
	private String marca;
	private String modelo;
	
	public Ex04Peca(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public abstract void retirada();

}
