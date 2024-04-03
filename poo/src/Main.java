import models.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Preto";
        carro1.marca = "BMW";
        carro1.velocidadeMaxima = 320;

        carro1.acelerar();

        System.out.printf(carro1.cor);
    }
}