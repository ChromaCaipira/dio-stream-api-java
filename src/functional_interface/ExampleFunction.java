package functional_interface;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;

public class ExampleFunction {
    public static void main(String[] args) {
    // Criando uma lista de números inteiros..
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    /* 
    // ..podermos usar a Function com expressão lambda para dobrar todos os números..
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    // ..ou criamos o Function diretamente no .map(), implementando seu método que
    // multiplicará por 2 para cada número da lista, e depois armazená-los em outra lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
            
        }) 
        .toList(); 

    // ..e imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
    */

    // ..ou usar a função para dobrar todos os números no Stream diretamento no map,
    //  utilizando lambda, e depois armazená-los em outra lista..
    List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2) // map(dobrar), se tivesse usado a Function anterior
        .toList();

    // ..e então imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
    }
}
