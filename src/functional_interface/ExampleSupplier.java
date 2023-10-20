package functional_interface;

import java.util.List;
// import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExampleSupplier {
    public static void main(String[] args) {
        /* 
        // Usando o Supplier com expressão lambda para fornecer uma saudação personalizada..
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // ..poderiamos usar o Supplier também para obter uma lista com 5 saudações,
        // com um limit() para dizer quantas vezes será gerada essa saudação
        // e um toList() para trazer todas essas saudações geradas para uma lista
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .toList();

        // ..e imprimir as saudações geradas, usando como atributo um println com lambda..
        listaSaudacoes.forEach(System.out::println); 
        */
        
        /* 
        // ..ou criar o primeiro Supplier diretamente no generate da lista, implementando
        // seu método que pegará a saudação, e depois armazenando as outras 5 saudações nela..
        List<String> listaSaudacoes = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
                }
            })
            .limit(5)
            .toList(); 
        
        // ..e imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println); 
        */

        // ..ou, melhor ainda, podemos retornar à ideia original mas trazendo aquele Supplier
        // diretamente no argumento do generate, sem criá-lo primeiro por fora
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
            .limit(5)
            .toList();

        // ..e então imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
