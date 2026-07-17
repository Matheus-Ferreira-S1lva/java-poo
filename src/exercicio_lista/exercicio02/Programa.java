package exercicio_lista.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(94, "Mouse AtackShark x11", 79.34));
        lista.add(new Produto(27, "Haylou n55 HeadPhones", 86.00));
        lista.add(new Produto(35, "Haylou S40 HeadPhones", 175.34));
        lista.add(new Produto(129, "Samsung A37 5g 8gb ram 256gb rom", 1477.91));

        System.out.println("Lista Produto:");
        for (Produto pro : lista) {
            System.out.println(pro);
        }

        System.out.println();
        System.out.println("Sera aplicado um desconto de 10% no produto de ID 35:");
        int iddesconto = 35;
        Integer pos = posicao(lista, iddesconto);
        if (pos != null) {
            System.out.print("O desconto foi aderido no : ");
            double porcent = 10.00;
            lista.get(pos).desconto(porcent);
            System.out.println(lista.get(2));
        } else {
            System.out.println("Esse ID nao existe!");
        }

        System.out.println();
        System.out.println("ID 94 Removido!");
        lista.removeIf(x -> x.getId() == 94);

        System.out.println();
        System.out.println("Lista de Produtos Atualizada:");
        for (Produto pro : lista) {
            System.out.println(pro);
        }
    }

    public static Integer posicao(List<Produto> lista, Integer id) {
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(lista.get(i).getId(), id)) {
                return i;
            }
        }
        return null;
    }
}
