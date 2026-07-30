package Data_Hora_Exercicios.Consultas.Exercicios.desafiosVoos;

import java.time.LocalDateTime;

public class Programa {
    public static void main(String[] args) {

        LocalDateTime dataPartida = LocalDateTime.of(2026, 8, 25, 17, 0);

        Voo vooSpToquio = new Voo(
                "São Paulo",
                "Tóquio",
                dataPartida,
                24,
                "America/Sao_Paulo",
                "Asia/Tokyo"
        );

        RadarDeVoo radar = new RadarDeVoo();

        radar.emitirRelatorioChegada(vooSpToquio);
    }
}
