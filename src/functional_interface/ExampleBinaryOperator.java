package functional_interface;

import java.util.Arrays;
import java.util.List;
// import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {
    public static void main(String[] args) {
        // Criando uma lista de números..
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        /*
        // ..podemos criar um BinaryOperator com expressão lambda para somar dois números inteiros..
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // ..e usá-lo para somar todos os números no Stream..
        int resultado = numeros.stream()
            .reduce(0, somar);

        // ..e então imprimir o resultado
        System.out.println(resultado); 
        */

        /* 
        // ..ou criar o BinaryOperator diretamente no reduce() do Stream,
        // implementando seu método para efetuar a soma dos números na lista
        int resultado = numeros.stream()
            .reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer n1, Integer n2) {
                    return n1 + n2;
                }
            });

        // ..e então imprimir o resultado
        System.out.println(resultado); 
        */

        // Entretanto, novamente, podemos simplificar ainda mais. Dessa vez,
        // utilizando o method reference Integer::sum, no lugar de criar o
        // BinaryOperator dentro do .reduce(), para efetuar a soma
        int resultado = numeros.stream()
            .reduce(0, Integer::sum);

        // ..e então imprimir o resultado
        System.out.println(resultado);
    }
}
