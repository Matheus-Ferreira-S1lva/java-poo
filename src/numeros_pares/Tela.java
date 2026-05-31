package numeros_pares;

import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int tamanho = teclado.nextInt();

        int[] vetor = new int[tamanho];

        for (int i=0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println();
        System.out.println("Numeros Pares:");

        Programa programa = new Programa(vetor);

        programa.Conta();


        teclado.close();
    }
}
