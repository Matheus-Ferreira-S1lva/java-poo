package matrizesexercicios.vendedor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as Linhas e Colunas: ");
        int n = teclado.nextInt();
        int m = teclado.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Digite os valores da matriz:");
        for (int i=0; i < mat.length; i++) {
            for (int j=0; j < mat[i].length; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Qual coluna você deseja somar?");
        int coluna = teclado.nextInt();

        CalculaMatriz procurar = new CalculaMatriz(mat);

        int somaFinal = procurar.somarColuna(coluna);

        System.out.print("A soma da coluna " + coluna + " é: " + somaFinal);

        teclado.close();
    }
}
