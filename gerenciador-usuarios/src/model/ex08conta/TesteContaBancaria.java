package model.ex08conta;

import model.ex04produtos.GerenciadorProduto;
import model.ex04produtos.Produto;

import java.util.List;
import java.util.Scanner;

public class TesteContaBancaria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorContaBancaria gerenciadorContaBancaria = new GerenciadorContaBancaria();

        while (true) {

            System.out.println("""
                    [1] Adicionar conta
                    [2] Listar contas
                    [3] Atualizar conta
                    [4] Excluir conta
                    [5] Sair do programa
                    """);
            System.out.println("Opção do menu: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta: ");
                    String numero = entrada.nextLine();

                    System.out.println("Nome do titular: ");
                    String nome = entrada.nextLine();

                    System.out.println("Tipo de conta (CP - Poupança / CC - Corrente: ");
                    String tipoConta = entrada.nextLine();

                    System.out.println("Saldo da conta: ");
                    double saldo = entrada.nextDouble();
                    entrada.nextLine();

                    ContaBancaria novaContaBancaria = new ContaBancaria(numero, nome, tipoConta, saldo);

                    if(!gerenciadorContaBancaria.adicionarContaBancaria(novaContaBancaria)) {
                        System.out.println("Conta bancária já cadastrada com esse número: " + numero);
                    } else {
                        System.out.println("Conta bancária cadastrada com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("LISTAR CONTAS BAANCÁRIAS CADASTRADAS");
                    List<ContaBancaria> listarContasBancariasCadastradas = gerenciadorContaBancaria.listarContasBancarias();

                    for (ContaBancaria contaBancaria :  listarContasBancariasCadastradas) {
                        System.out.println(contaBancaria);


                    }
                    gerenciadorContaBancaria.calcularSaldoTodasContas();
                    break;
                case 3:
                    System.out.println("Informe o número da conta bancária a ser atualizada: ");
                    String numeroParaAtualizar = entrada.nextLine();

                    System.out.println("Novo titular: ");
                    String titularParaAtualizar = entrada.nextLine();

                    System.out.println("Novo tipo de conta(CP - Poupança / CC - Corrente: ");
                    String tipoContaParaAtualizar = entrada.nextLine();

                    gerenciadorContaBancaria.atualizarContaBancaria(numeroParaAtualizar, titularParaAtualizar,tipoContaParaAtualizar);


                    break;
                case 4:
                    System.out.println("Informe o número da conta bancária a ser atualizada: ");
                    String numeroParaRemover = entrada.nextLine();

                   gerenciadorContaBancaria.removerContaBancaria(numeroParaRemover);

                    break;
                case 5:
                    System.out.println("SAINDO DO PROGRAMA");
                    entrada.close();
                    return;
                default:
                    System.out.println("ERRO: Opção inválida, tente novamente...");
            }


        }

    }
}
