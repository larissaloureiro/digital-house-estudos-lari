package exercicios.loops;

import java.util.Scanner;

public class Ex02UsuarioESenha {

	public static void main(String[] args) {
		// Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha
		// igual o nome de usu�rio, mostrando uma mensagem de erro voltando para pedir
		// informa��es.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um nome de usu�rio: ");
		String usuario = scanner.nextLine();
		
		String senha = "";
		do {
			if (senha.equals(usuario)) {
				System.out.println("Senha inv�lida.");
			}
			System.out.print("Digite uma senha: ");
			senha = scanner.nextLine();
		} while (senha.equals(usuario));
		
		scanner.close();
		
		System.out.println("Usu�rio e senha registrados com sucesso.");
		
	}

}
