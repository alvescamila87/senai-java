package ex03;

public class TesteLivro {

    public static void main(String[] args) {
        Livro l01 = new Livro("Clean code", "Uncle Bob", 2013);
        System.out.println(l01.isEstaEmprestado());

        l01.devolverLivro();
        l01.emprestarLivro();
        l01.emprestarLivro();
        l01.devolverLivro();

        l01.imprimirInformacoes();
    }
}
