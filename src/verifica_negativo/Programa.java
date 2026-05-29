package verifica_negativo;

public class Programa {

    private double[] vetor;

    public Programa(double[] vetor) {
        this.vetor = vetor;
    }

    public void Conta() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
