package models;

import java.security.PublicKey;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas(){
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }
    @Override
    public void display() {
        System.out.println("INFORMAÇÕES DE CARRO: "
                + " \nMarca: " + getMarca()
                + " \nModelo: " + getModelo()
                + " \nAno fabricação: " + getAno()
                + " \nNúmero de portas: " + getNumeroPortas());
    }
}
