package empregado;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = teclado.nextLine();

        System.out.print("Salario bruto: ");
        funcionario.salario = teclado.nextDouble();

        System.out.print("Taxa: ");
        funcionario.taxa = teclado.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " +  funcionario.nome + ", $ " + funcionario.CalcSalario());

        System.out.println();
        System.out.println("Deseja almentar o salario em qual porcetagem? ");
        double porcent = teclado.nextDouble();

        funcionario.CalcPorcento(porcent);

        System.out.println();
        System.out.printf("Dados corrigidos: %s, $ %.2f%n", funcionario.nome, funcionario.CalcSalario());


        teclado.close();
    }
}


