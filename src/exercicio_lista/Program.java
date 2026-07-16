package exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serao digitados? ");
        int quantidade = teclado.nextInt();

        for (int i=0; i < quantidade; i++) {
            System.out.println();
            System.out.println("Empregado #"+ (i + 1) + ";");

            System.out.print("Id: ");
            Integer id = teclado.nextInt();

            teclado.nextLine();

            System.out.print("name: ");
            String nome = teclado.nextLine();

            System.out.print("Salario: ");
            Double salario = teclado.nextDouble();

            Employee emp = new Employee(id, nome, salario);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Digite o Id que tera o salario aumentado: ");
        int idsalario = teclado.nextInt();
        int pos = posicao(list, idsalario);
        if (pos == -1) {
            System.out.println("Esse Id não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = teclado.nextDouble();
            list.get(pos).aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        teclado.close();
    }

    public static int posicao(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
