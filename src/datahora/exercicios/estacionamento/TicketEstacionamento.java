package datahora.exercicios.estacionamento;

import java.time.LocalTime;

public class TicketEstacionamento {
    private String placa;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;

    public TicketEstacionamento(String placa, LocalTime horaEntrada, LocalTime horaSaida) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }
}
