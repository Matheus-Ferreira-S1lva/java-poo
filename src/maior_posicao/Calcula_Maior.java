package maior_posicao;

public class Calcula_Maior {

    private int[] vetor;


    public Calcula_Maior(int[] vetor) {
        this.vetor = vetor;
    }

    public void CalcP() {
        int maior = vetor[0];
        int posicao = 0;
        for (int i=0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.print("Posicao do maior valor = " + posicao);
    }


}
