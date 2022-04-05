package aulaPOOBanco;

public interface AcessoInterno {
	
	//Os metodos nao tem comportamento(corpo). So assinatura.
	/**
	 * 
	 * @param String usuario => Pode-se informar um usuário válido
	 * @param String senha => Pode-se informar uma senha com até 255 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha estiver correta.
	 */
	public boolean autenticarSistema(String usuario, String senha);
	public boolean mudarUsuario(String usuarioAntigo, String novoUsuario);
	public boolean mudarSenha(String senhaAntiga, String novaSenha);

}
