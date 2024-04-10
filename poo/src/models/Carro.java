package models;

/**
 *   Carro é um veículo que permite especificar ainda o 'número de portas' por tipo.
 */
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

    /**
     * Exibe as informações do carro, considerando marca, modelo, ano de fabricação e número de portas.
     */
    @Override
    public void display() {
        System.out.println("INFORMAÇÕES DE CARRO: "
                + " \nMarca: " + getMarca()
                + " \nModelo: " + getModelo()
                + " \nAno fabricação: " + getAno()
                + " \nNúmero de portas: " + getNumeroPortas());
    }
}
