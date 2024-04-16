package ex02;

public class ContaBancaria {

    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0.0;
    }



    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.err.println("Saque não permitido, saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void imprimirExtrato(){
        System.out.println("\nEXTRATO BANCÁRIO");
        System.out.println("--------------------------");
        System.out.println("Nome: ") + ;
    }
}
