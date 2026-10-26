package heranca.desafio;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Funcionario> funcionario = new ArrayList<>();

        System.out.print("Insira o número de funcionários ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        String resposta;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Empregado " + (i + 1) + " dados:");
            System.out.println("Terceirizado (s/n)? ");
            resposta = teclado.nextLine();

            if (resposta.equals("y")) {

                System.out.print("Nome: ");
                String nome = teclado.nextLine();

                System.out.print("Hora: ");
                int hora = teclado.nextInt();
                System.out.print("Valor por hora: ");
                double valorHora = teclado.nextDouble();
                System.out.print("Valor adicional: ");
                double valorAdd = teclado.nextDouble();
                teclado.nextLine();

                FuncionarioTerceirizado funcionario1 = new FuncionarioTerceirizado(nome, hora, valorHora, valorAdd);
                funcionario.add(funcionario1);

            } else {

                System.out.print("Nome: ");
                String nome = teclado.nextLine();
                System.out.print("Hora: ");
                int hora = teclado.nextInt();
                System.out.print("Valor por Hora: ");
                double horaValor = teclado.nextDouble();

                teclado.nextLine();


                Funcionario funcionario2 = new Funcionario(nome, hora, horaValor);
                funcionario.add(funcionario2);
            }
        }

        System.out.println("\nPAGAMENTOS");
        for (Funcionario f : funcionario) {
            System.out.println(f.getNome() + " - $ " + f.pagamentoComum());

        }
    }
}
