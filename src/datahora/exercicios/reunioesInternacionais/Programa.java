package datahora.exercicios.reunioesInternacionais;

import java.time.LocalDateTime;

public class Programa {
    public static void main(String[] args) {
        LocalDateTime base = LocalDateTime.of(2026, 10, 15, 14, 30);

        Reuniao reuniao = new Reuniao("Git and deploy", base, "America/Sao_Paulo");

        AgendaInternacional agenda = new AgendaInternacional();

        agenda.dispararConvites(reuniao);
    }
}
