package aulas;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		// Esses m�todos s�o da classe caracter
		System.out.println("======= M�TODOS DA CLASSE CARACTER =======");
		
		// Verifica se o valor � um n�mero, retorna true ou false
		System.out.println("======= M�todo .isDigit() =======");
		System.out.println("5 � um n�mero? " + Character.isDigit('5'));
		System.out.println("a � um n�mero? " + Character.isDigit('a'));
		System.out.println();
		
		// Verifica se o valor � uma letra, retorna true ou false
		System.out.println("======= M�todo .isLetter() =======");
		System.out.println("5 � uma letra? " + Character.isLetter('5'));
		System.out.println("a � uma letra? " + Character.isLetter('a'));
		System.out.println();
		
		// Verifica se o valor � uma letra ou numero, retorna true ou false
		System.out.println("======= M�todo .isLetterOrDigit() =======");
		System.out.println("5 � uma letra ou n�mero? " + Character.isLetterOrDigit('5'));
		System.out.println("a � uma letra ou n�mero? " + Character.isLetterOrDigit('a'));
		System.out.println("@ � uma letra ou n�mero? " + Character.isLetterOrDigit('@'));
		System.out.println();
		
		// Verifica se o valor est� escrito em mai�sculo, retorna true ou false
		System.out.println("======= M�todo .isUpperCase() =======");
		System.out.println("5 est� escrito em mai�sculo? " + Character.isUpperCase('5'));
		System.out.println("a est� escrito em mai�sculo? " + Character.isUpperCase('a'));
		System.out.println("B est� escrito em mai�sculo? " + Character.isUpperCase('B'));
		System.out.println();
		
		// Verifica se o valor est� escrito em min�sculo, retorna true ou false
		System.out.println("======= M�todo .isLowerCase() =======");
		System.out.println("5 est� escrito em min�sculo? " + Character.isLowerCase('5'));
		System.out.println("a est� escrito em min�sculo? " + Character.isLowerCase('a'));
		System.out.println("B est� escrito em min�sculo? " + Character.isLowerCase('B'));
		System.out.println();
		
		// Verifica se o valor � um espa�o em branco, retorna true ou false
		System.out.println("======= M�todo .isWhitespace() =======");
		System.out.println("'5' � um espa�o em branco? " + Character.isWhitespace('5'));
		System.out.println("'a' � um espa�o em branco? " + Character.isWhitespace('a'));
		System.out.println("' ' � um espa�o em branco?? " + Character.isWhitespace(' '));
		System.out.println();
		
		
		// Esses m�todos s�o da classe caracter
		System.out.println("======= M�TODOS DA CLASSE STRING =======");
		
		// Verifica valor antigo e substitui pelo valor novo
		System.out.println("======= M�todo .replace(\"string1\", \"string2\") =======");
		String arquivo = "escola.java";
		System.out.println("arquivo original: " + arquivo);
		arquivo = arquivo.replace("java", "class");
		System.out.println("arquivo ap�s utiliza��o do m�todo: " + arquivo);
		System.out.println();
		
		String nome1 = "larissa";
		String nome2 = "Larissa";
		
		// Compara duas strings, diferencia mai�sculas e min�sculas
		System.out.println("======= M�todo .equals(\"string1\", \"string2\") =======");
		System.out.println("larissa = Larissa ? " + nome1.equals(nome2));
		System.out.println();
		
		// Compara duas strings, ignora mai�sculas e min�sculas
		System.out.println("======= M�todo .equalsIgnoreCase(\"string1\", \"string2\") =======");
		System.out.println("larissa = Larissa ?  " + nome1.equalsIgnoreCase(nome2));
		System.out.println();
		
		// Compara se o inicio da string � igual � sequencia de caracteres informada, diferencia mai�sculas e min�sculas
		System.out.println("======= M�todo .startsWith(\"string\") =======");
		System.out.println("larissa come�a com lar ?  " + nome1.startsWith("lar"));
		System.out.println("larissa come�a com Lar ?  " + nome1.startsWith("Lar"));
		System.out.println();
		
		// Compara se o final da string � igual � sequencia de caracteres informada, diferencia mai�sculas e min�sculas
		System.out.println("======= M�todo .endsWith(\"string\") =======");
		System.out.println("larissa termina com ssa ?  " + nome1.endsWith("ssa"));
		System.out.println("larissa come�a com ssA ?  " + nome1.endsWith("ssA"));
		System.out.println();
		
		// Compara as letras uma a uma, muito usado para colocar em ordem alfab�tica
		// collections
		System.out.println("======= M�todo .compareTo(\"string\") =======");
		System.out.println(nome1.compareTo(nome2));
		System.out.println();
		
		// Retorna o tamanho da string
		System.out.println("======= M�todo .length() =======");
		System.out.println("Tamanho da string nome1: " + nome1.length());
		System.out.println();
		
		// Mostra o valor armazenado em um determinado �ndice
		System.out.println("======= M�todo .charAt(0) =======");
		System.out.println("Valor na posi��o 4: " + nome1.charAt(4));
		System.out.println();
		
		// Retorna uma parte de uma string (informar in�cio e fim), o valor no �ltimo �ndice informado n�o � inclu�do na substring
		System.out.println("======= M�todo .substring(2, 4) =======");
		System.out.println("substring (2,4): " + nome1.substring(2, 4));
		System.out.println();
		
		// Retorna o �ndice da primeira ocorrencia de uma letra
		System.out.println("======= M�todo .indexOf(\"a\") =======");
		System.out.println("Primeira ocorrencia da letra a: " + nome1.indexOf("a"));
		System.out.println();
		
		// Retorna o �ndice da ultima ocorrencia de uma letra
		System.out.println("======= M�todo .lastIndexOf(\"a\") =======");
		System.out.println("�ltima ocorrencia da letra a: " + nome1.lastIndexOf("a"));
		System.out.println();
		
	}

}
