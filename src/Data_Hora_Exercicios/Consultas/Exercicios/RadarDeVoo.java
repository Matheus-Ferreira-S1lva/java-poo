package Data_Hora_Exercicios.Consultas.Exercicios;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class RadarDeVoo {
        public void emitirRelatorioChegada(Voo voo) {
            ZoneId zone = ZoneId.of(voo.getFusoOrigem());
            ZonedDateTime zoned = voo.getDataHoraPartida().atZone(zone);

            ZonedDateTime shora = zoned.plusHours(voo.getDuracaoHoras());

            ZoneId zoneDestino = ZoneId.of(voo.getFusoDestino());
            ZonedDateTime chegada = shora.withZoneSameInstant(zoneDestino);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            System.out.println("Partida de Origem: " + zoned.format(fmt));
            System.out.println("Duração do voo: " + voo.getDuracaoHoras() + " horas");
            System.out.println("Chegada no Destino (Horário Local): " + chegada.format(fmt));
        }
}
