import models.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("Patrícia", "13131313");

        conta01.depositar(100);
        System.out.println(conta01.getSaldo());
        conta01.sacar(101);
        System.out.println(conta01.getSaldo());

        conta01.imprimirExtrato();

        //Ex 04 - Construtor this();
        ContaBancaria conta02 = new ContaBancaria("Princesa Isabel", "6516981981", 100);
        System.out.println("Titular: " + conta02.getNomeTitular());
        System.out.println("C/C: " + conta02.getNomeTitular());
        System.out.println("Saldo R$: " + conta02.getNomeTitular());
    }
}
