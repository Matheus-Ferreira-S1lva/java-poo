package convertor;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double preco = teclado.nextDouble();

        System.out.print("Quantos dolares queres comprar? ");
        double compra = teclado.nextDouble();

        double resultado = ConversorMoeda.CalcDolar(preco, compra);
        System.out.printf("Quantia a ser paga em reais = %.2f%n", resultado);
    }
}
