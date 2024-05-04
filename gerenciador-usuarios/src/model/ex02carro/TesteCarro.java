package model.ex02carro;

import model.ex02carro.Carro;
import model.ex02carro.GerenciadorCarro;

import java.util.List;
import java.util.Scanner;

/**
 * Esta classe contém o método main para testar o gerenciamento de carros.
 */
public class TesteCarro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorCarro gerenciadorCarro = new GerenciadorCarro();

        int opcao = 0;

        while(opcao != 5) {
            System.out.println("""
                    ------------- MENU -------------
                    [1] Adicionar carro
                    [2] Listar todos os carros
                    [3] Atualizar dados do carro 
                    [4] Remover carro
                    [5] Sair do programa 
                    --------------------------------
                    """);

            System.out.print("Informe a opção do menu: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 :
                    System.out.println("Placa do veículo: ");
                    String placa = entrada.nextLine();

                    System.out.println("Modelo do veículo: ");
                    String modelo = entrada.nextLine();

                    System.out.println("Cor do veículo: ");
                    String cor = entrada.nextLine();

                    System.out.println("Ano de fabricação (AAAA): ");
                    int ano = entrada.nextInt();
                    entrada.nextLine();

                    Carro novoCarro = new Carro(placa, modelo, cor, ano);

                    if(!gerenciadorCarro.adicionarCarro(novoCarro)) {
                        System.out.println("Veículo já cadastrado com essa Placa: " + placa);
                    } else {
                        System.out.println("Veículo adicionado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("LISTA DE VEÍCULOS CADASTRADOS");
                    System.out.println("---------------------------------------");

                    List<Carro> listaDeVeiculosCadastrados = gerenciadorCarro.obterTodosCarros();
                    for (Carro c : listaDeVeiculosCadastrados) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.println("Informe a placa do veículo que deseja atualizar os dados: ");
                    String placaParaAtualziar = entrada.nextLine();

                    System.out.println("Novo modelo do carro: ");
                    String novoModeloParaAtualizar = entrada.nextLine();

                    System.out.println("Nova cor do carro: ");
                    String novaCorParaAtualizar = entrada.nextLine();
                    entrada.nextLine();

                    gerenciadorCarro.atualizarCarro(placaParaAtualziar, novoModeloParaAtualizar, novaCorParaAtualizar);
                    break;
                case 4:
                    System.out.println("REMOVER VEÍCULO");
                    System.out.println("---------------------------");
                    System.out.println("Placa do veículo para remover: ");
                    String placaParaRemover = entrada.nextLine();
                    gerenciadorCarro.removerCarro(placaParaRemover);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    entrada.close();
                    break;
                default:
                    System.out.println("ERRO: Opção inválida! Tente novamente");
            }

        }


    }
}
