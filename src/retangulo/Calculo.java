package retangulo;

public class Calculo {

    private double largura;
    private double altura;

    public Calculo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double CalcArea() {
        return largura * altura;
    }

    public double CalcPerimetro() {
        return 2 * (largura + altura);
    }

    public double CalcDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
