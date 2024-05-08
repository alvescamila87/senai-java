package model;

/**
 * Classe que representa um livro. Contendo um ISBN, título, autor e ano de publicação.
 */
public class Livro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    /**
     * Construtor sem argumentos do objeto do livro. Todos os atributos serão nulos.
     */
    public Livro(){}


    /**
     * Construtor que representa um objeto do tipo livro
     * @param ISBN representa código ID único do livro (Padrão Internacional de Numeração de livro).
     * @param titulo representa o titulo do livro;
     * @param autor representa o autor do livro;
     * @param anoDePublicacao representa o ano de publicação do livro;
     */
    public Livro(String ISBN, String titulo, String autor, int anoDePublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }
}
