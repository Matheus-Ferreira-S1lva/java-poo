package aprovados;

public class CalculaAprovado {
    private String[] nome;
    private double[] nota;
    private double[] nota1;

    private static final double MEDIA = 6.00;

    public CalculaAprovado(String[] nome, double[] nota, double[] nota1) {
        this.nome = nome;
        this.nota = nota;
        this.nota1 = nota1;
    }

    public void Aprovados() {
        double divisao = 0;
        for (int i=0; i < nota.length; i++) {
            divisao = (nota[i] + nota1[i]) / 2.0;
            if (divisao >= MEDIA) {
                System.out.println(nome[i]);
            }
        }
    }
}
