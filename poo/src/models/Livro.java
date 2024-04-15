package models;

/**
 * Livro que solicita informações relacionado ao empréstimo de livro na Biblioteca, como título, autor,
 * ano de publicação e se está emprestado.
 */
public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    boolean estaEmprestado = false;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public boolean isEstaEmprestado(){
        return estaEmprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEstaEmprestado(boolean estaEmprestado){
        this.estaEmprestado = estaEmprestado;
    }

    /**
     * Permite pegar o livro emprestado da biblioteca, checando se já está ou não emprestado.
     */
    public boolean emprestarLivro(){
        if(estaEmprestado){
            System.out.println("Esse livro já está emprestado!");
            return false;
        } else {
            estaEmprestado = true;
            System.out.println("Empréstimo realizado com sucesso!");
            return true;
        }
    }

    /**
     * Permite devolver livro emprestado da biblioteca, checando se está ou não emprestado.
     */
    public boolean devolverLivro(){
        if(estaEmprestado) {
            estaEmprestado = false;
            System.out.println("Devolução de livro realizada com sucesso!");
            return true;
        } else {
            System.out.println("Esse livro está emprestado!");
            return false;
        }
    }

    /**
     * Exibe as informações relacionado ao livro da biblioteca, como título, autor, ano de publicação
     * e se está emprestado.
     */
    public void imprimirInformacoes() {
        System.out.println("INFORMAÇÕES DO LIVRO: "
                + " \nTítulo: " + titulo
                + " \nAutor: " + autor
                + " \nAno de publicação: " + anoPublicacao
                + " \nEstá emprestado: " + estaEmprestado);
    }


}
