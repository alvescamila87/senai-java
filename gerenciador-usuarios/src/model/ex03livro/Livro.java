package model.ex03livro;

public class Livro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String ISBN, String titulo, String autor, int anoDePublicacao){
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
    public String toString(){
        return "Livro [ISBN: " + ISBN
                + " Título: " + titulo
                + " Autor: " + autor
                + " Ano de publicação: " + anoDePublicacao
                + "]";
    }
}
