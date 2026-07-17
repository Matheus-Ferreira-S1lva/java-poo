package exercicio_lista.exercicio01;

public class Employee {

    private Integer id;
    private String nome;
    private Double salario;

    public  Employee() {
    }

    public Employee(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * porcentagem / 100.0;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}