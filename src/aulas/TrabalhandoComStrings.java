package aulas;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		// Esses métodos são da classe caracter
		System.out.println("======= MÉTODOS DA CLASSE CARACTER =======");
		
		// Verifica se o valor é um número, retorna true ou false
		System.out.println("======= Método .isDigit() =======");
		System.out.println("5 é um número? " + Character.isDigit('5'));
		System.out.println("a é um número? " + Character.isDigit('a'));
		System.out.println();
		
		// Verifica se o valor é uma letra, retorna true ou false
		System.out.println("======= Método .isLetter() =======");
		System.out.println("5 é uma letra? " + Character.isLetter('5'));
		System.out.println("a é uma letra? " + Character.isLetter('a'));
		System.out.println();
		
		// Verifica se o valor é uma letra ou numero, retorna true ou false
		System.out.println("======= Método .isLetterOrDigit() =======");
		System.out.println("5 é uma letra ou número? " + Character.isLetterOrDigit('5'));
		System.out.println("a é uma letra ou número? " + Character.isLetterOrDigit('a'));
		System.out.println("@ é uma letra ou número? " + Character.isLetterOrDigit('@'));
		System.out.println();
		
		// Verifica se o valor está escrito em maiúsculo, retorna true ou false
		System.out.println("======= Método .isUpperCase() =======");
		System.out.println("5 está escrito em maiúsculo? " + Character.isUpperCase('5'));
		System.out.println("a está escrito em maiúsculo? " + Character.isUpperCase('a'));
		System.out.println("B está escrito em maiúsculo? " + Character.isUpperCase('B'));
		System.out.println();
		
		// Verifica se o valor está escrito em minúsculo, retorna true ou false
		System.out.println("======= Método .isLowerCase() =======");
		System.out.println("5 está escrito em minúsculo? " + Character.isLowerCase('5'));
		System.out.println("a está escrito em minúsculo? " + Character.isLowerCase('a'));
		System.out.println("B está escrito em minúsculo? " + Character.isLowerCase('B'));
		System.out.println();
		
		// Verifica se o valor é um espaço em branco, retorna true ou false
		System.out.println("======= Método .isWhitespace() =======");
		System.out.println("'5' é um espaço em branco? " + Character.isWhitespace('5'));
		System.out.println("'a' é um espaço em branco? " + Character.isWhitespace('a'));
		System.out.println("' ' é um espaço em branco?? " + Character.isWhitespace(' '));
		System.out.println();
		
		
		// Esses métodos são da classe caracter
		System.out.println("======= MÉTODOS DA CLASSE STRING =======");
		
		// Verifica valor antigo e substitui pelo valor novo
		System.out.println("======= Método .replace(\"string1\", \"string2\") =======");
		String arquivo = "escola.java";
		System.out.println("arquivo original: " + arquivo);
		arquivo = arquivo.replace("java", "class");
		System.out.println("arquivo após utilização do método: " + arquivo);
		System.out.println();
		
		String nome1 = "larissa";
		String nome2 = "Larissa";
		
		// Compara duas strings, diferencia maiúsculas e minúsculas
		System.out.println("======= Método .equals(\"string1\", \"string2\") =======");
		System.out.println("larissa = Larissa ? " + nome1.equals(nome2));
		System.out.println();
		
		// Compara duas strings, ignora maiúsculas e minúsculas
		System.out.println("======= Método .equalsIgnoreCase(\"string1\", \"string2\") =======");
		System.out.println("larissa = Larissa ?  " + nome1.equalsIgnoreCase(nome2));
		System.out.println();
		
		// Compara se o inicio da string é igual à sequencia de caracteres informada, diferencia maiúsculas e minúsculas
		System.out.println("======= Método .startsWith(\"string\") =======");
		System.out.println("larissa começa com lar ?  " + nome1.startsWith("lar"));
		System.out.println("larissa começa com Lar ?  " + nome1.startsWith("Lar"));
		System.out.println();
		
		// Compara se o final da string é igual à sequencia de caracteres informada, diferencia maiúsculas e minúsculas
		System.out.println("======= Método .endsWith(\"string\") =======");
		System.out.println("larissa termina com ssa ?  " + nome1.endsWith("ssa"));
		System.out.println("larissa começa com ssA ?  " + nome1.endsWith("ssA"));
		System.out.println();
		
		// Compara as letras uma a uma, muito usado para colocar em ordem alfabética
		// collections
		System.out.println("======= Método .compareTo(\"string\") =======");
		System.out.println(nome1.compareTo(nome2));
		System.out.println();
		
		// Retorna o tamanho da string
		System.out.println("======= Método .length() =======");
		System.out.println("Tamanho da string nome1: " + nome1.length());
		System.out.println();
		
		// Mostra o valor armazenado em um determinado índice
		System.out.println("======= Método .charAt(0) =======");
		System.out.println("Valor na posição 4: " + nome1.charAt(4));
		System.out.println();
		
		// Retorna uma parte de uma string (informar início e fim), o valor no último índice informado não é incluído na substring
		System.out.println("======= Método .substring(2, 4) =======");
		System.out.println("substring (2,4): " + nome1.substring(2, 4));
		System.out.println();
		
		// Retorna o índice da primeira ocorrencia de uma letra
		System.out.println("======= Método .indexOf(\"a\") =======");
		System.out.println("Primeira ocorrencia da letra a: " + nome1.indexOf("a"));
		System.out.println();
		
		// Retorna o índice da ultima ocorrencia de uma letra
		System.out.println("======= Método .lastIndexOf(\"a\") =======");
		System.out.println("Última ocorrencia da letra a: " + nome1.lastIndexOf("a"));
		System.out.println();
		
	}

}
