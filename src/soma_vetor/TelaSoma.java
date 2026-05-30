package soma_vetor;

import java.util.Scanner;

public class TelaSoma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tamanho = teclado.nextInt();

        double[] vect = new double[tamanho];

        for (int i=0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = teclado.nextDouble();
        }

        System.out.println();

        Programa programa = new Programa(vect);

        System.out.print("Valores = ");
        programa.FazConta();

        System.out.print("Soma = ");
        programa.Soma();

        System.out.print("Media = ");
        programa.Media();

        teclado.close();
    }
}
