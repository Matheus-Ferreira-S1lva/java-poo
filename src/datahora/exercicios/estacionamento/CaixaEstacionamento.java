package datahora.exercicios.estacionamento;

import java.time.Duration;
import java.time.LocalTime;

public class CaixaEstacionamento {
    public void cobrarTicket(TicketEstacionamento ticket) {
        LocalTime horaEntrada = ticket.getHoraEntrada();
        LocalTime horaSaida = ticket.getHoraSaida();

        Duration tempo = Duration.between(horaEntrada, horaSaida);

        long horas = tempo.toHours();
        long minutos = tempo.toMinutesPart();

        double valorHora = 10.0;
        double precoFracao = 2.0;

        double valorTotal = horas * valorHora;

        if (minutos > 0) {
            valorTotal += precoFracao;
        }

        System.out.println("Placa: " + ticket.getPlaca());
        System.out.println("Tempo de permanência: " + horas + " Horas e " + minutos + " minutos");
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotal);    }
}
