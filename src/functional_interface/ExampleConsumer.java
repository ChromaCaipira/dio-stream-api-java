package functional_interface;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class ExampleConsumer {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        /* 
        // Poderiamos usar esse Consumer com expressão lambda para imprimir números pares..
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // ..e usar um stream().forEach() para imprimir os números pares ali dentro..
        numeros.stream().forEach(imprimirNumeroPar);

        // ..(ou até simplificar esse stream() desnecessário nesse caso)..
        numeros.forEach(imprimirNumeroPar); 
        */

        /* 
        // ..mas podemos ir além e criar um Consumer diretamente no forEach(), implementando
        // seu método para aceitar apenas os números que o resto da divisão dá zero
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        }); 
        */

        /* 
        // Entretanto, não é necessário ser tão enorme assim, então simplificamos com o lambda
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }); 
        */

        // Contudo, e se filtrássemos, agora com conhecimento do predicate?
        // Até mais simples
        numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}