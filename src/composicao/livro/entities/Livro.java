package composicao.livro.entities;

public class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void exibirAutor() {
        System.out.println("Titulo: " + titulo
                + " | Preco R$: " + preco
                + " | Nome do Autor: " + autor.getNome()
                + " | Nacionalidade do Autor: " + autor.getNacionalidade()
        );
    }
}
