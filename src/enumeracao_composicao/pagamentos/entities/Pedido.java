package enumeracao_composicao.pagamentos.entities;

import java.util.Date;

public class Pedido {

    private Integer id;
    private Date dataInstante; // Traduzido de 'moment'
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(Integer id, Date dataInstante, StatusPedido status) {
        this.id = id;
        this.dataInstante = dataInstante;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInstante() {
        return dataInstante;
    }

    public void setDataInstante(Date dataInstante) {
        this.dataInstante = dataInstante;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataInstante=" + dataInstante +
                ", status=" + status +
                '}';
    }
}