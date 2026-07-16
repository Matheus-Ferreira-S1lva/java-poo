package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] argsn) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Muiel");
        list.add("Miyuki");
        list.add("Ana");
        list.add("Geise");


        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------");
        list.removeIf(x -> x.charAt(2) == 'r');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------");
        System.out.println("Index de Muiel: " + list.indexOf("Muiel"));
        System.out.println("Index de Mariana: " + list.indexOf("Mariana"));

        System.out.println("-----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x :result) {
            System.out.println(x);
        }

        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);
    }
}
