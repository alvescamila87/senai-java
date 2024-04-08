import models.Carro;
import models.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Camila");
        pessoa1.setIdade(36);
        pessoa1.setAltura(1.60);

        System.out.println();
        System.out.println("Informações de PESSOA");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + "anos.");
        System.out.printf("Altura: " + pessoa1.getAltura());
    }
}