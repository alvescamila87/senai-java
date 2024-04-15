import models.Carro;

public class TesteVeiculoCarro {
    public static void main(String[] args) {

        Carro carro01 = new Carro("VW", "Polo", 2023);
        carro01.display();

        // Ex 05 - Construtor THIS();
        Carro carro02 = new Carro("Dodge", "RAM", 2024, 4, "Preta");
        carro02.display();

    }
}
