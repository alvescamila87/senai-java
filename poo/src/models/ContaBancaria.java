package models;
/**
 * Conta bancária que solicita informações relacionadas ao titular, número da conta e saldo em banco.
 */
public class ContaBancaria {

    private String nomeTitular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    // métodos

    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!");
            return false;
        }

        return true;
    }

    /**
     * Imprime o extrato bancário do titular, exibindo informações de número da conta e saldo.
     */
    public void imprimirExtrato(){
        System.out.println("CONTA BANCÁRIA: " + "\n[Nome titular: " + nomeTitular + " \nNúmero da conta: " + numeroConta + " \nSaldo: R$" + saldo + "]");
    }

}
