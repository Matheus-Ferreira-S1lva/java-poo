package enumeracao_composicao.pagamentos.application;

import enumeracao_composicao.pagamentos.entities.Pedido;
import enumeracao_composicao.pagamentos.entities.StatusPedido;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido1);

        StatusPedido status1 = StatusPedido.ENTREGUE;

        StatusPedido status2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(status1);
        System.out.println(status2);
    }
}