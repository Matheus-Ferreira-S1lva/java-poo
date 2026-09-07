package composicao.cars.entities;

public class Carro {
    private String modelo;
    private Motor motor;

   public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirDados() {
        System.out.println("Carro: " + modelo +
                " | " + "Motor: " + motor.getTipo()
                + " com " + motor.getPotencia() +
                " cv");
        }
}
