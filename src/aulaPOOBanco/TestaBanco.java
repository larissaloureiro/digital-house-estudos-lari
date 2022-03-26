package aulaPOOBanco;

public class TestaBanco {
	public static void main(String[] args) {
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma instância = cópia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("=================");
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Nome: " + pessoaNumero2.nome);
		
		Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
		pessoaNova.setNome("Jose das Couves");
		System.out.println("Nome: " + pessoaNova.getNome());
		System.out.println("===============================");
		
		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55", "123.456-78");
		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
		System.out.println("RG: " + pessoaComConstrutor1.getRg());
	}
}
