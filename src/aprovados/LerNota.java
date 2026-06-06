package aprovados;

import java.util.Scanner;

public class LerNota {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos seram digitados? ");
        int tamanho = teclado.nextInt();

        String[] nome = new String[tamanho];
        double[] nota = new double[tamanho];
        double[] nota1 = new double[tamanho];

        for (int i=0; i < nome.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "+ (i+1)+"o aluno(a): ");

            teclado.nextLine();

            nome[i] = teclado.nextLine();
            nota[i] = teclado.nextDouble();
            nota1[i] = teclado.nextDouble();
        }

        CalculaAprovado calculaAprovado = new CalculaAprovado(nome, nota, nota1);

        System.out.println("Alunos aprovados:");
        calculaAprovado.Aprovados();

        teclado.close();
    }
}
