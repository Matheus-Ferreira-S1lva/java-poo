package matrizesExercicios.exercicio02;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int m = teclado.nextInt();
        System.out.println();
        System.out.print("Digite a quantidade de colunas: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println();
        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.print("Qual numero você quer procurar: ");
        int x = teclado.nextInt();

        Matriz buscador = new Matriz(matriz);

        buscador.encontrarVizinhos(x);

        teclado.close();
    }
}
