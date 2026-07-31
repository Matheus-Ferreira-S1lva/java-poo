package matrizesexercicios.campominado;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do Terreno: ");
        int n = teclado.nextInt();
        int m = teclado.nextInt();
        int[][] mat = new int[n][m];

        System.out.println("Digite o mapa (0 para seguro, 1 para mina):");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j< mat[i].length; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        System.out.println();
        System.out.println("Onde o robô vai pousar? (Linha e Coluna):");
        System.out.print("Linha: ");
        int linha = teclado.nextInt();
        System.out.print("Coluna: ");
        int coluna = teclado.nextInt();

        Radar radar = new Radar(mat);

        int totalBombas = radar.verificaBombas(linha, coluna);

        System.out.println("ALERTA! O robô encontrou " + totalBombas + " minas ao redor da posição " + linha + "," + coluna);

        teclado.close();
    }
}
