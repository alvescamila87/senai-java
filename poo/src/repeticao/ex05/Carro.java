package repeticao.ex05;

public class Carro extends Veiculo{

    private int numeroDePortas;
    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
    @Override
    void display() {
        System.out.println("INFORMAÇÕES DO CARRO: ");
        System.out.println("------------------------------------");
        System.out.printf("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nPortas: " +getNumeroDePortas());
    }
}
