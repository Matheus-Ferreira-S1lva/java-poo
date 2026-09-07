package composicao.computador.entities;

public class Processador {
    private String modelo;
    private double frequenciaGhz;

    public Processador(String modelo, double frequenciaGhz) {
        this.modelo = modelo;
        this.frequenciaGhz = frequenciaGhz;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequenciaGhz() {
        return frequenciaGhz;
    }

    public void setFrequenciaGhz(double frequenciaGhz) {
        this.frequenciaGhz = frequenciaGhz;
    }
}
