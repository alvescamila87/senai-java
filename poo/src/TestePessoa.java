import models.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Camila");
        pessoa1.setIdade(36);
        pessoa1.setAltura(1.60);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Zebedeu");
        pessoa2.setIdade(33);
        pessoa2.setAltura(1.87);

        System.out.println();
        System.out.println("Informações de PESSOA 01");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + "anos.");
        System.out.printf("Altura: " + pessoa1.getAltura());

        System.out.println();
        System.out.println("Informações de PESSOA 01");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade() + "anos.");
        System.out.printf("Altura: " + pessoa2.getAltura());

        // Construtor inicializado
        Pessoa pessoa3 = new Pessoa();
        System.out.println();
        System.out.println("Informações de PESSOA 03");
        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("Nacionalidade: " + pessoa3.getIdade());


    }
}