package conversor;

public class ConversorMoeda {
    private double dolarPreco;
    private double compraDolar;

        //Transforma a taxa em uma constante estática
        public static final double IOF = 0.06;

        //Faz o calculo considerando um IOF de 6%
        public static double CalcDolar(double dolarPreco, double compraDolar) {
            return (dolarPreco * compraDolar) * (1.0 + IOF);
        }
}
