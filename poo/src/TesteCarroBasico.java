import models.CarroBasico;

public class TesteCarroBasico {
    public static void main(String[] args) {

        /*
        Carro carro1 = new Carro();

        carro1.cor = "Preto";
        carro1.marca = "BMW";
        carro1.velocidadeMaxima = 320;

        carro1.acelerar();

        System.out.println("Cor: " + carro1.cor);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Velocidade máxima: " + carro1.velocidadeMaxima + "km/h.");

        carro1.frear();

         */

        CarroBasico carro2 = new CarroBasico();
        carro2.setCor("Branco");
        carro2.setMarca("VW");
        carro2.setVelocidadeMaxima(220);

        System.out.println();
        System.out.println("Informações de CARRO");

        carro2.acelerar();

        System.out.println("Cor veículo: " + carro2.getCor());
        System.out.println("Marca do veiculo: " + carro2.getMarca());
        System.out.println("Velocidade máxima do veículo: " + carro2.getVelocidadeMaxima() + "km/h.");

        carro2.frear();
    }
}