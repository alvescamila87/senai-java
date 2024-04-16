package ex03;

public class Livro {
    private String titulo;
    private String autor;
    int anoDePublicacao;
    boolean estaEmprestado;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.estaEmprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    public boolean isEstaEmprestado(){
        return estaEmprestado;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setEstaEmprestado(boolean estaEmprestado){
        this.estaEmprestado = estaEmprestado;
    }

    public boolean emprestarLivro(){
        if(estaEmprestado) {
            System.out.println("ERRO: Este livro NÃO está disponível para empréstimo.");
            return false;
        } else {
            System.out.println("Empréstimo realizado com sucesso!");
            estaEmprestado = true;
            return true;
        }
    }

    public boolean devolverLivro(){
        if(estaEmprestado) {
            System.out.println("Livro devolvido à biblioteca com sucesso!");
            estaEmprestado = false;
            return true;
        } else {
            System.out.println("ERRO: O livro JÁ está em empréstimo!");
            return false;
        }
    }

    public void imprimirInformacoes(){
        System.out.println("INFORMAÇÕES DO LIVRO: ");
        System.out.println("-------------------------------");
        System.out.printf("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de publicação: " + getAnoDePublicacao() + "\nDisponível para empréstimo: " + isEstaEmprestado());
    }


}
