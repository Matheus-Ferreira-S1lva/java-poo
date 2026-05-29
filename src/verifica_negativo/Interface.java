package verifica_negativo;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de numeros que você vai digitar: ");
        int quantidade = teclado.nextInt();

        double[] vetor = new double[quantidade];

        for (int i =0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = teclado.nextDouble();
        }

        Programa programa = new Programa(vetor);

        System.out.println("Numeros negativos:");

        programa.Conta();

        teclado.close();
    }
}
