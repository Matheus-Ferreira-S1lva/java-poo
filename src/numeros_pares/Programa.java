package numeros_pares;

public class Programa {

    private int[] vetor;

    public Programa(int[] vetor) {
        this.vetor = vetor;
    }

    public void Conta() {
        int contPar = 0;
        for (int i=0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " ");
                contPar++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares = " + contPar);
    }
}
