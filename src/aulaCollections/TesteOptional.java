package aulaCollections;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TesteOptional {

	public static void main(String[] args) {
		
		// .of -> Recebe valor do tipo que estamos trabalhando
		Optional<String> listaString = Optional.of("Valor optional presente");
		
		// .ifPresentOrElse -> Se tiver informação, retorna o primeiro valor/expressão indicado. Se não, retorna o segundo.
		// System.out::println / () -> System.out.println("Não está presente") -> Expressão Lambda
		listaString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); 
		
		// Espera um possível valor nulo
		Optional<String> listaNula = Optional.ofNullable(null);
		listaNula.ifPresentOrElse(System.out::println, () -> System.out.println("Nulo o valor não está presente"));
		
		// Verifica se a lista está vazia
		Optional<String> listaVazia = Optional.empty();
		listaVazia.ifPresentOrElse(System.out::println, () -> System.out.println("Vazio o valor não está presente"));
		
		// Erro pois não aceita o tipo null
		// Optional<String> listaComErro = Optional.of(null);
		// listaComErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro o valor não está presente"));
		
		System.out.println("Valores Inteiros");
		OptionalInt.of(22).ifPresent(System.out::println);
		
		System.out.println("Valores Inteiros Longos");
		OptionalLong.of(23L).ifPresent(System.out::println);
		
		System.out.println("Valores Decimais");
		OptionalDouble.of(22.55).ifPresent(System.out::println);

	}

}
