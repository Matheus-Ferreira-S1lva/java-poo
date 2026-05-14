package retangulo;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double l = teclado.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double a = teclado.nextDouble();

        Calculo calculo = new Calculo(l, a);


        System.out.println();
        System.out.println("AREA: " + calculo.CalcArea());


        System.out.println();
        System.out.println("PERIMETRO: " + calculo.CalcPerimetro());


        System.out.println();
        System.out.println("DIAGONAL: " + calculo.CalcDiagonal());


        teclado.close();
    }
}
