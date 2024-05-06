package model.ex02carro;

/**
 * Esta classe representa um carro com suas características básicas.
 */
public class Carro {

    private String placa;
    private String modelo;
    private String cor;

    private int anoDeFabricacao;

    /**
     * Construtor da classe Carro.
     * @param placa A placa do carro.
     * @param modelo O modelo do carro.
     * @param cor A cor do carro.
     * @param anoDeFabricacao O ano de fabricação do carro.
     */
    public Carro(String placa, String modelo, String cor, int anoDeFabricacao){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    /**
     * Obtém a placa do carro.
     * @return A placa do carro.
     */
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

    public int calcularIdadeCarro() {
        int anoAtual = 2024;
        int idadeVeiculo = anoAtual - anoDeFabricacao;
        return idadeVeiculo;
    }

    /**
     * Retorna uma representação em String do objeto Carro.
     * @return Uma representação em String do objeto Carro.
     */
    @Override
    public String toString() {
        return "Carro{" +
                "placa ='" + placa + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", cor ='" + cor + '\'' +
                ", ano de fabricação = '" + anoDeFabricacao + '\'' +
                ", tempo de uso = '" + calcularIdadeCarro() + '\'' + " anos" +
                '}';
    }
}
