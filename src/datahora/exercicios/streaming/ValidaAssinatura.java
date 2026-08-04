package datahora.exercicios.streaming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidaAssinatura {
    public void verificaAcesso(Usuario usuario) {
        LocalDate expiracao = usuario.getDataExpiracao();
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter fort = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        if (expiracao.isBefore(dataAtual)) {
            System.out.println("Acesso Bloqueado! A assinatura do usuário " + usuario.getNome() + " venceu em " + expiracao.format(fort));
        } else {
            System.out.println("Acesso Liberado! Bom filme, " + usuario.getNome() + "!");
        }
    }

}
