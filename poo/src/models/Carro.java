package models;

public class Carro {

    // Atributos

    public String cor;
    public String marca;
    public int velocidadeMaxima;

    // Métodos

    public void acelerar(){
        System.out.printf("O carro está acelerando.");
    }

    public void frear() {
        System.out.printf("O carro está freando.");
    }
}
