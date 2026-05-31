package maior_posicao;

import java.util.Scanner;

public class Verifica_Maior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int tamanho = teclado.nextInt();

        int[] vetor = new int[tamanho];

        for (int i=0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = teclado.nextInt();
        }

        Calcula_Maior calcula_maior = new Calcula_Maior(vetor);

        calcula_maior.CalcP();

    }
}
