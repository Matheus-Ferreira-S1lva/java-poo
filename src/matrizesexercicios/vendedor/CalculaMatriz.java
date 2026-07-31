package matrizesexercicios.vendedor;

public class CalculaMatriz {

    private int[][] matriz;

    public CalculaMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int somarColuna(int indexeColuna) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][indexeColuna];
        }
        return soma;
    }
}
