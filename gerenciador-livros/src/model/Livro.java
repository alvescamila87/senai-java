package model;

/**
 * Classe que representa um livro.
 */
public class Livro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    /**
     * Construtor com parâmetros: código ISBN, titulo, autor e ano de publicação do livro.
     */
    public Livro(String ISBN, String titulo, String autor, int anoDePublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    /**
     * Recupera o código ISBN do livro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Configura o código ISBN do livro
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Recupera o titulo do livro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Configura o titulo do livro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Recupera o autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Configura o autor do livro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Recupera o anor de publicacao do livro
     */
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    /**
     * Configura o ano de publicacao do livro
     */
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    /**
     * Imprime as propriedades (informações) do livro
     */
    @Override
    public String toString() {
        return "Livro [" +
                "ISBN: " + ISBN +
                ", Título: " + titulo +
                ", Autor: " + autor +
                ", Ano de publicação: " + anoDePublicacao +
                "]";
    }
}
