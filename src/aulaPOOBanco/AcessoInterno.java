package aulaPOOBanco;

public interface AcessoInterno {
	
	//Os metodos nao tem comportamento(corpo). So assinatura.
	/**
	 * 
	 * @param String usuario => Pode-se informar um usu�rio v�lido
	 * @param String senha => Pode-se informar uma senha com at� 255 caracteres alfanum�ricos
	 * @return retorna verdadeiro quando a senha estiver correta.
	 */
	public boolean autenticarSistema(String usuario, String senha);
	public boolean setUsuario(String usuario, String novoUsuario);
	public boolean setSenha(String senha, String novaSenha);

}
