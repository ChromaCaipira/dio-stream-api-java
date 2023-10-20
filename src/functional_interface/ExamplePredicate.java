package functional_interface;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {
        // Criando uma lista de palavras..
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "html", "css", "c++");

        /* 
        // ..podemos criar um Predicate que verifica se a palavra tem mais de 5 caracteres..
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // ..e então usar o Stream para filtrar a lista de palavras por aquelas com mais de 5 caracteres
        // e, em seguida, imprimir cada palavra que passou no filtro..
        palavras.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println); 
        */

        /* 
        // ..ou criamos o Predicate diretamente no filtro, implementando seu método test() para testar
        // se a palavra é maior do que cinco e então efetuar essa filtragem em cada palavra da lista,
        // e depois imprimindo cada palavra que passou no filtro
        palavras.stream()
            .filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String p) {
                        return p.length() > 5;
                    }
                    
                }
            )
            .forEach(System.out::println); 
        */

        // Entretanto, de novo, ficou muito grande. Utilizamos da expressão lambda para simplificar
        palavras.stream()
            .filter(p -> p.length() > 5)
            .forEach(System.out::println);
    }
}
