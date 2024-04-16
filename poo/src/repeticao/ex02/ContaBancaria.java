package repeticao.ex02;

public class ContaBancaria {

    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0.0;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saque não permitido, saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.err.println("ERRO: Saque realizado com sucesso!");
        }
    }

    public void imprimirExtrato(){
        System.out.println("\nEXTRATO BANCÁRIO");
        System.out.println("--------------------------");
        System.out.println("Nome: " + getNomeDoTitular() + "\nNúmero conta bancária: " + getNumeroDaConta() + "\nSaldo R$: " + getSaldo());
    }
}
