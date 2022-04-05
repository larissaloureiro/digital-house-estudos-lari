package aulas;

public class TesteEmailExpressoesRegulares {

	public static void main(String[] args) {
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		ExpressoesRegulares emailInvalido1 = new ExpressoesRegulares("teste@teste");
		ExpressoesRegulares emailInvalido2 = new ExpressoesRegulares("testeteste.com.br");
		
		System.out.println("=======================");
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("11", "912345678");
		System.out.println(telefoneValido.toString());
		ExpressoesRegulares2 telefoneValido2 = new ExpressoesRegulares2("21", "12345678");
		System.out.println(telefoneValido2.toString());
		
		System.out.println("=======================");
		
		ExpressoesRegulares2 dddInvalido = new ExpressoesRegulares2("210", "912345678");
		
		System.out.println("=======================");
		
		ExpressoesRegulares2 numeroInvalido = new ExpressoesRegulares2("21", "1234567890");

	}

}
