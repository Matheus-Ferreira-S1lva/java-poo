package enumeracao_composicao.empresa;

public class Funcionario {
    private String nome;
    private double salario;
    private NivelCargo nivel;

    public Funcionario(String nome, double salario, NivelCargo nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelCargo getNivel() {
        return nivel;
    }

    public void setNivel(NivelCargo nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", nivel=" + nivel +
                '}';
    }
}
