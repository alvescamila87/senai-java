package models;

public class Carro {

    // Atributos

    private String cor;
    private String marca;
    private int velocidadeMaxima;

    // Métodos

    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public String getCor(){
        return cor;
    }

    public String getMarca(){
        return marca;
    }

    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
