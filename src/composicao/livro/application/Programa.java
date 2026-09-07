package composicao.livro.application;

import composicao.livro.entities.Autor;
import composicao.livro.entities.Livro;

public class Programa {
    public static void main(String[] args) {
        Autor dados = new Autor("Lima Barreto", "Brasileira");
        Livro book = new Livro("Triste fim de Policarpo Quaresma", 13.69, dados);

        book.exibirAutor();
    }
}
