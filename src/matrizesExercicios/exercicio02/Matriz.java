package matrizesExercicios.exercicio02;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void encontrarVizinhos(int alvo) {
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j< matriz[i].length; j++) {
                if (matriz[i][j] == alvo) {
                    System.out.println("Posição " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }

                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }

                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }

                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}
