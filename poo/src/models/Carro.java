package models;

/**
 *   Carro é um veículo que permite especificar ainda o 'número de portas' por tipo.
 */
public class Carro extends Veiculo {

    private int numeroPortas;
    private String cor;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.cor = cor;
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas, String cor){
        this(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.cor = cor;
    }

    public int getNumeroPortas(){
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Exibe as informações do carro, considerando marca, modelo, ano de fabricação e número de portas.
     */
    @Override
    public void display() {
        System.out.println("INFORMAÇÕES DE CARRO: "
                + " \nMarca: " + getMarca()
                + " \nModelo: " + getModelo()
                + " \nAno fabricação: " + getAno()
                + " \nCor: " + getCor()
                + " \nNúmero de portas: " + getNumeroPortas());
    }
}
