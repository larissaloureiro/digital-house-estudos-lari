package exercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class L01Ex11CalculaIdade {

	public static void main(String[] args) {
		// Faça um programa para ler o nome e o ano , mês e dia de nascimento de um cidadão.
		// Calcular e informar sua idade.
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "";
		int anoNascimento = 0;
		int mesNascimento = 0;
		int diaNascimento = 0; 
		int idade = 0;
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH);
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		System.out.print("Digite o dia de nascimento: ");
		diaNascimento = Integer.valueOf(leia.nextLine());
		System.out.print("Digite o mês de nascimento: ");
		mesNascimento = Integer.valueOf(leia.nextLine()) - 1;
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = Integer.valueOf(leia.nextLine());
		
		
		idade = anoAtual - anoNascimento;
		if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
			idade--;
		}
		
		System.out.println("Idade: " + idade);
		
		leia.close();

	}

}
