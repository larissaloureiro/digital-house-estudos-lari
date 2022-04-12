package exercicios.loops;

import java.util.Scanner;

public class Ex02UsuarioESenha {

	public static void main(String[] args) {
		// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
		// igual o nome de usuário, mostrando uma mensagem de erro voltando para pedir
		// informações.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um nome de usuário: ");
		String usuario = scanner.nextLine();
		
		String senha = "";
		do {
			if (senha.equals(usuario)) {
				System.out.println("Senha inválida.");
			}
			System.out.print("Digite uma senha: ");
			senha = scanner.nextLine();
		} while (senha.equals(usuario));
		
		scanner.close();
		
		System.out.println("Usuário e senha registrados com sucesso.");
		
	}

}
