package model.ex02;

import java.util.Date;

public class Carro {

    private String placa;
    private String modelo;
    private String cor;

    private int anoDeFabricacao;

    public Carro(String placa, String modelo, String cor, int anoDeFabricacao){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }

    public void setPlaca(){
        this.placa = placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getIdadeCarro() {
        int anoAtual = 2024;
        int idadeVeiculo = anoAtual - anoDeFabricacao;
        return idadeVeiculo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa ='" + placa + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", cor ='" + cor + '\'' +
                ", ano de fabricação = '" + anoDeFabricacao + '\'' +
                ", tempo de uso = '" + getIdadeCarro() + '\'' + " anos" +
                '}';
    }
}
