package model.ex08conta;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContaBancaria {

    private List<ContaBancaria> listaDeContasBancarias = new ArrayList<>();

    public boolean adicionarContaBancaria(ContaBancaria contaBancaria){
        for (ContaBancaria cb : listaDeContasBancarias){
            if(contaBancaria.getNumero().equals(cb.getNumero())) {
                return false;
            }
        }
        listaDeContasBancarias.add(contaBancaria);
        return true;
    }

    public List<ContaBancaria> listarContasBancarias(){
        return listaDeContasBancarias;
    }

    private ContaBancaria listarContaBancariaPorNumero(String numero){
        for (ContaBancaria cb : listaDeContasBancarias) {
            if(numero.equals(cb.getNumero())){
                return cb;
            }
        }
        return null;
    }

    public void atualizarContaBancaria(String numero, String titular, String tipoConta){
        ContaBancaria contaBancariaParaAtualizar = listarContaBancariaPorNumero(numero);

        if(contaBancariaParaAtualizar != null) {
            contaBancariaParaAtualizar.setNomeTitular(titular);
            contaBancariaParaAtualizar.setTipoConta(tipoConta);
        }
    }

    public boolean removerContaBancaria(String numero) {
        for (ContaBancaria cb : listaDeContasBancarias) {
            if (numero.equals(cb.getNumero())){
                listaDeContasBancarias.remove(cb);
                return true;
            }
        }
        return false;
    }

    public void calcularSaldoTodasContas(){
        double saldoGeral = 0;
        List<ContaBancaria> saldosBancarios = listarContasBancarias();
        for (ContaBancaria cb : saldosBancarios) {
            saldoGeral += cb.getSaldo();
        }
        System.out.println("Saldo geral: R$" + saldoGeral);
    }
}
