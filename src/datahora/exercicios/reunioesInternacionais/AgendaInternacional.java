package datahora.exercicios.reunioesInternacionais;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter; // Importamos o formatador

public class AgendaInternacional {
    public void dispararConvites(Reuniao reuniao) {
        LocalDateTime dataBase = reuniao.getDataHoraBase();
        String fusoReuniao = reuniao.getFusoOrigem();

        ZonedDateTime zoneDeSP = dataBase.atZone(ZoneId.of(fusoReuniao));
        ZonedDateTime zoneDeUK = zoneDeSP.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zoneDeNY = zoneDeSP.withZoneSameInstant(ZoneId.of("America/New_York"));

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        System.out.println("--- CONVITE DA REUNIÃO ---");
        System.out.println("Assunto: " + reuniao.getAssunto());
        System.out.println("Horário no Brasil: " + zoneDeSP.format(fmt));
        System.out.println("Horário em Londres: " + zoneDeUK.format(fmt));
        System.out.println("Horário em Nova York: " + zoneDeNY.format(fmt));
    }
}