package escola;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeAux = teclado.nextLine();

        System.out.println("Digita sua nota1: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digita sua nota2: ");
        double n2 = teclado.nextDouble();

        System.out.println("Digita sua nota3: ");
        double n3 = teclado.nextDouble();

        Aluno aluno = new Aluno(nomeAux, n1, n2, n3);

        System.out.println();

        if (aluno.notaFinal() < 60.0) {
            System.out.println("Nota final: " + aluno.notaFinal());
            System.out.println("Falhou! ");
            System.out.println("Pontos faltantes: " + aluno.calcPontos());
        } else {
            System.out.println("Nota final: " + aluno.notaFinal());
            System.out.println("Passou! ");
        }

        teclado.close();
    }
}
