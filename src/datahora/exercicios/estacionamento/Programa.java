package datahora.exercicios.estacionamento;

import java.time.LocalTime;

public class Programa {
    public static void main(String[] args) {
        LocalTime entrada = LocalTime.of(14, 30);
        LocalTime saida = LocalTime.of(18, 45);

        TicketEstacionamento insercao = new TicketEstacionamento("SAD7U34", entrada, saida);

        CaixaEstacionamento ticket = new CaixaEstacionamento();

        ticket.cobrarTicket(insercao);
    }
}
