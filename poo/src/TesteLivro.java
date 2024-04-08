import models.Livro;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro01 = new Livro("Head First Java: A Brain-Friendly Guide", "Kathy Sierra", 2022);

        livro01.imprimirInformacoes();

        System.out.println(livro01.emprestarLivro());

        Livro livro02 = new Livro("Clean Code", "Uncle Bob", 2003);

        livro02.setEstaEmprestado(true);

        livro02.emprestarLivro();

        livro02.imprimirInformacoes();

    }
}
