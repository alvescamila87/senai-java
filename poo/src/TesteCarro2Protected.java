import models.Carro;

public class TesteCarro2Protected {
    public static void main(String[] args) {

        Carro carro03 = new Carro("Mercedes", "C180", 2023);
        carro03.display(); // não permite acessar o método protected "exibirCategoria" visto que está em pacote diferente    
    }
}
