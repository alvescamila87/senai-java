package ex02;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria c01 = new ContaBancaria("68169313-88", "Dom João");

        c01.sacar(5_000);
        c01.depositar(2_000);

        System.out.println(c01.getSaldo());

        c01.imprimirExtrato();

    }
}
