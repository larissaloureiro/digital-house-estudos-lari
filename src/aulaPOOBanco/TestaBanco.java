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
		
//		Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		System.out.println("===============================");
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55", "123.456-78");
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor1.getRg());
		
		PessoaFisica pfJose = new PessoaFisica();
		pfJose.setNome("Jose das Couves");
		pfJose.setEmail("josedascouves@email.com");
		pfJose.setTelefone("21999995555");
		pfJose.setCpf("879.359.983-88");
		pfJose.setRg("12234578-9");
				
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
//		conta1.setSaldo(1000000.50); // Não se deve alterar diretamente essa informação. Ela apenas pode ser exibida.
		conta1.setTitular(pfJose);
		
		conta1.depositar(100000.00);
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f \n", conta1.getSaldo());
		
		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Verifique o valor do saque!");
		}
		System.out.printf("Saldo Atual(após saque): R$ %.2f \n", conta1.getSaldo());
		
		System.out.println("==========================================");
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000.0, conta2);
		System.out.printf("Saldo Atual %s: R$ %.2f \n", conta1.getTitular().getNome(), conta1.getSaldo());
		System.out.printf("Saldo Atual João dos Tomates: R$ %.2f \n", conta2.getSaldo());
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000.00);
		System.out.println("Saldo: " + cc1.getSaldo());
		System.out.println("Limite: " + cc1.getLimite());
		System.out.println("Saldo com Limite: " + cc1.getSaldoComLimite());
		cc1.sacar(1500.0);
		System.out.println("Saque de 1500.00 efetuado");
		System.out.println("Saldo com Limite: " + cc1.getSaldoComLimite());
		System.out.println("Saldo: " + cc1.getSaldo());
	}
}
