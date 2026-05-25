package conta_bancaria;

public class Sistema {

    private String nome;
    private double preco;
    private int contnumero;

    // Valor constante da taxa
    private static final double TAXA = 5.00;

    public Sistema(String nome, double preco, int contnumero) {
        this.nome = nome;
        this.preco = preco;
        this.contnumero = contnumero;
    }

    public Sistema(int contnumero, String nome) {
        this.contnumero = contnumero;
        this.nome = nome;
    }

    public void realizarDeposito(double deposito) {
        this.preco +=  deposito;
    }

    public void realizarSaque(double valorSaque) {
        this.preco -= (valorSaque + TAXA);
    }

    public int getContnumero() {
        return contnumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
}
