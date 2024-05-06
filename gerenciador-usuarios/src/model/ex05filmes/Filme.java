package model.ex05filmes;

public class Filme {

    private String codigo;
    private String titulo;
    private String diretor;
    private int anoLancamento;

    public Filme(String numero, String titulo, String diretor, int anoLancamento) {
        this.codigo = numero;
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int calcularIdadeFilme(){
        int anoAtual = 2024;
        return anoAtual - getAnoLancamento();
    }

    @Override
    public String toString() {
        return "Filme {" +
                "código='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", idade do filme=" + calcularIdadeFilme() + " anos" +
                '}';
    }
}
