package dados_pessoas;

import java.util.Objects;
import java.util.Scanner;

public class Tela_Genero {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int tamanho = teclado.nextInt();

        double[] altura = new double[tamanho];
        String[] genero = new String[tamanho];

        for (int i=0; i < altura.length; i++) {
            System.out.println("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = teclado.nextDouble();

            teclado.nextLine();

            System.out.println("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = teclado.nextLine();

        }

        Verifica_Altura verifica_altura = new Verifica_Altura(altura, genero);

        System.out.println();
        verifica_altura.Altura();

        System.out.println();
        verifica_altura.Media();

        teclado.close();
    }
}
