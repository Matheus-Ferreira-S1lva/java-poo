package matrizesexercicios.campominado;

public class Radar {
    private int[][] matriz;

    public Radar(int[][] matriz) {
        this.matriz = matriz;
    }

    public int verificaBombas(int linhas, int colunas) {
        int bombasEncontradas = 0;

        if (colunas > 0 && matriz[linhas][colunas - 1] == 1) {
            bombasEncontradas++;
        }

        if (colunas < matriz[linhas].length - 1 && matriz[linhas][colunas + 1] == 1) {
            bombasEncontradas++;
        }

        if (linhas > 0 && matriz[linhas - 1][colunas] == 1) {
            bombasEncontradas++;
        }

        if (linhas < matriz.length - 1 && matriz[linhas + 1][colunas] == 1) {
            bombasEncontradas++;
        }

        return bombasEncontradas;
    }
}
