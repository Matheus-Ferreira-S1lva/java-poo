package dados_pessoas;

import java.util.Objects;

public class Verifica_Altura {

    private double[] altura;
    private String[] genero;

    public Verifica_Altura(double[] altura, String[] genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public void Altura() {
        double menor = altura[0];
        double maior = altura[0];
        for (int i=0; i < altura.length; i++) {
            if (menor > altura[i]) {
                menor = altura[i];
            }
            if (maior < altura[i]) {
                maior = altura[i];
            }
        }
        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
    }

    public void Media() {
        double somaM = 0.00;
        int quantM = 0;
        int man = 0;
        for (int i=0; i < altura.length; i++) {
            if (Objects.equals(genero[i].trim().toUpperCase(), "F")) {
                somaM += altura[i];
                quantM++;
            } else {
                man++;
            }
        }
        double media = (quantM > 0) ? (somaM / quantM) : 0.00;

        System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        System.out.println("Numero de homens = " + man);
    }
}
