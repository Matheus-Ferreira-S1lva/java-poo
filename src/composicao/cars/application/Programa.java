package composicao.cars.application;

import composicao.cars.entities.Carro;
import composicao.cars.entities.Motor;

public class Programa {
    public static void main(String[] args) {
        Motor meuMotor = new Motor("2.0 TSI", 231);
        Carro meuCarro = new Carro("Jetta", meuMotor);

        meuCarro.exibirDados();
    }
}
