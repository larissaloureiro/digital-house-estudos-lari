package aulaPOOBanco;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {
	// mockado
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";
	
	// Construtores
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super(nome, cpf, ctps, salario, dataAdmissao);
		// TODO Auto-generated constructor stub
	}
	
	// Metodos
	@Override
	public double getBonus() {
		return this.getSalario() * 0.15;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mudarUsuario(String usuarioAntigo, String novoUsuario) { // Usuario pode ter até 12 caracteres
		if (this.usuario.equals(usuarioAntigo) && novoUsuario.length() <= 12) {
			this.usuario = novoUsuario;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mudarSenha(String senhaAntiga, String novaSenha) { //Senha pode ter até 8 caracteres.
		if (this.senha.equals(senhaAntiga) && novaSenha.length() <= 8) {
			this.senha = novaSenha;
			return true;
		}
		return false;
	}
	
	
	
}
