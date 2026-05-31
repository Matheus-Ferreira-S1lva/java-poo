package verifica_idade;

public class Verifica {
    private double m;
    private double s;
    private String[] nome;
    private double[] altura;
    private int[] idade;

    public Verifica(String[] nome, double[] altura, int[] idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public void AlturaM() {
        m = 0;
        s = 0;
        for(int i=0; i < altura.length; i++) {
            s += altura[i];
        }
        m = s / altura.length;
        System.out.printf("%.2f%n", m);
    }

    public double Porcetagem() {
        double porcent = 0;
        double menores = 0;
        for (int i=0; i < idade.length; i++) {
            if (idade[i] < 16) {
                menores++;
                porcent = (menores * 100.00) / idade.length;
            }
        }
        return porcent;
    }

    public void MostrarMenores() {
        for (int i =0; i < idade.length; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }
    }
}
