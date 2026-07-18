package exercicio_lista.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class ExercicioStreams {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Matteew");
        nomes.add("Gabriela");
        nomes.add("Carlos");
        nomes.add("Alice");
        nomes.add("Marcos");

        List<String> largeNomes = nomes.stream().filter(x -> x.length() > 5).toList();

        System.out.println("Nomes com mais de 5 letras:");
        System.out.println(largeNomes);

        String nomesComM = nomes.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        String nomesComZ = nomes.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);


        System.out.println("\nBusca individual:");
        System.out.println("Primeiro com M: " + nomesComM);
        System.out.println("Primeiro com Z: " + nomesComZ);

        System.out.println();

        System.out.println("Lista completa com Nomes que começam com M:");
        List<String> todosComM = nomes.stream().filter(x -> x.charAt(0) == 'M').toList();
        System.out.println(todosComM
        );
    }
}
