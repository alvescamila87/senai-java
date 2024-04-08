package models;

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

    public String getTitulo(String titulo){
        return titulo;
    }

    public String getAutor(String autor){
        return autor;
    }

    public int getAnoPublicacao(int anoPublicacao){
        return anoPublicacao;
    }

    public boolean isEstaEmprestado(boolean estaEmprestado){
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

    public void imprimirInformacoes() {
        System.out.println("INFORMAÇÕES DO LIVRO: "
                + " \nTítulo: " + titulo
                + " \nAutor: " + autor
                + " \nAno de publicação: " + anoPublicacao
                + " \nEstá emprestado: " + estaEmprestado);
    }


}
