package soma_vetor;

public class Programa {
    private double s;
    private double media;
    private double[] vect;

    public Programa(double[] vect) {
        this.vect = vect;
    }
    
    public void FazConta() {
        for (int i=0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();
    }

    public void Soma() {
        s = 0;
        for (int i=0; i < vect.length; i++) {
            s += vect[i];
        }
        System.out.printf("%.2f%n", s);
    }

    public void Media() {
        media = s / vect.length;
        System.out.printf("%.2f%n", media);
    }
}
