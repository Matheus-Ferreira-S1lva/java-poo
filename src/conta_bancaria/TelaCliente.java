package conta_bancaria;

import java.util.Objects;
import java.util.Scanner;

public class TelaCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorcont;

        System.out.print("Digite o numero da conta: ");
        int numerocont = teclado.nextInt();

        teclado.nextLine();
        System.out.print("Diigite o nome do titular da conta: ");
        String pessoa = teclado.nextLine();

        System.out.print("Deseja depositar algum valor inicial (y/n): ");
        String resposta = teclado.nextLine();

        Sistema sistema;

        if (!Objects.equals(resposta, "y")) {
             sistema = new Sistema(numerocont, pessoa);
        } else {
            System.out.print("Adicione um valor inicial: ");
            valorcont = teclado.nextDouble();
            sistema = new Sistema(pessoa, valorcont, numerocont);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println("Conta " + sistema.getContnumero() + "," + " Dono: " + sistema.getNome() + "," + " Extrato: $ " + sistema.getPreco());

        System.out.println();
        System.out.print("Coloque um valor de deposito: ");
        double depositar = teclado.nextDouble();

        sistema.realizarDeposito(depositar);

        System.out.println("Dados atualizados:");
        System.out.println("Conta: " + sistema.getContnumero() + "," + " Dono: " + sistema.getNome() + "," + " Extrato: $ " + sistema.getPreco());

        System.out.println();
        System.out.print("Digite um valor de saque: ");
        double sacar = teclado.nextDouble();

        sistema.realizarSaque(sacar);

        System.out.println("Dados atualizados:");
        System.out.println("Conta: " + sistema.getContnumero() + "," + " Dono: " + sistema.getNome() + "," + " Extrato: $ " + sistema.getPreco());

        teclado.close();
    }
}
