package model.ex08conta;

public class ContaBancaria {

    private String numero;
    private String nomeTitular;
    private String tipoConta;
    private double saldo;

    public ContaBancaria(String numero, String nomeTitular, String tipoConta, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo += valor;
    }


    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero='" + numero + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
