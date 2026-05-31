package verifica_idade;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas seram digitadas? ");
        int tamanho = teclado.nextInt();

        teclado.nextLine();

        String[] vetorN = new String[tamanho];
        double[] vetorA = new double[tamanho];
        int[] vetorI = new int[tamanho];


        for (int i=0; i < vetorN.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.println("Nome: ");
            vetorN[i] = teclado.nextLine();

            System.out.println("Idade: ");
            vetorI[i] = teclado.nextInt();

            System.out.println("Altura: ");
            vetorA[i] = teclado.nextDouble();

            teclado.nextLine();
            System.out.println();
        }

        Verifica verifica = new Verifica(vetorN, vetorA, vetorI);

        System.out.println("Altura média: ");
        verifica.AlturaM();

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", verifica.Porcetagem());
        verifica.MostrarMenores();

        teclado.close();
    }
}
