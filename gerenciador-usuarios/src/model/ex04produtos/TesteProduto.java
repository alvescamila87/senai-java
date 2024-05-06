package model.ex04produtos;

import java.util.List;
import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorProduto gerenciadorProduto = new GerenciadorProduto();

        while (true) {

            System.out.println("""
                    [1] Adicionar produto
                    [2] Listar produtos
                    [3] Atualizar produto
                    [4] Excluir produto
                    [5] Sair do programa
                    """);
            System.out.println("Opção do menu: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o código do produto: ");
                    String codigo = entrada.nextLine();

                    System.out.println("Nome do produto: ");
                    String nome = entrada.nextLine();

                    System.out.println("Categoria do produto: ");
                    String categoria = entrada.nextLine();

                    System.out.println("Preço do produto: ");
                    double preco = entrada.nextDouble();

                    Produto produtoNovo = new Produto(codigo, nome, categoria, preco);

                    if(!gerenciadorProduto.adicionarProduto(produtoNovo)) {
                        System.out.println("Produto já cadastrado com esse Código: " + codigo);
                    } else {
                        System.out.println("Produto cadastrado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("LISTAR PRODUTOS CADASTRADOS");
                    List<Produto> listarProdutosCadastrados = gerenciadorProduto.listarProdutos();

                    for (Produto produto :  listarProdutosCadastrados) {
                        System.out.println(produto);
                    }

                    break;
                case 3:
                    System.out.println("Informe o código do produto a ser atualizado: ");
                    String codigoParaAtualizar = entrada.nextLine();

                    int opcaoAtualizar = 0;

                    while (opcao != 5) {

                        System.out.println("""
                                [1] Atualizar todas as informações do produto
                                [2] Atualizar somente preço e categoria
                                [3] Atualizar somente preço
                                [4] Atualizar somente categoria
                                [5] Sair e retornar ao menu principal
                                """);
                        System.out.println("Opção do menu: ");
                        opcaoAtualizar = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcaoAtualizar) {
                            case 1:
                                System.out.println("Nova nome do produto: ");
                                String nomeParaAtualizar = entrada.nextLine();

                                System.out.println("Nova categoria do produto: ");
                                String categoriaParaAtualizar = entrada.nextLine();

                                System.out.println("Novo preço do produto: ");
                                double precoParaAtualizar = entrada.nextDouble();

                                gerenciadorProduto.atualizarProduto(codigoParaAtualizar, nomeParaAtualizar, categoriaParaAtualizar, precoParaAtualizar);
                                break;
                            case 2:
                                System.out.println("Nova categoria do produto: ");
                                categoriaParaAtualizar = entrada.nextLine();

                                System.out.println("Novo preço do produto: ");
                                precoParaAtualizar = entrada.nextDouble();

                                gerenciadorProduto.atualizarProduto(codigoParaAtualizar, categoriaParaAtualizar, precoParaAtualizar);
                                break;
                            case 3:
                                System.out.println("Novo preço do produto: ");
                                precoParaAtualizar = entrada.nextDouble();

                                gerenciadorProduto.atualizarProduto(codigoParaAtualizar, precoParaAtualizar);
                                break;
                            case 4:
                                System.out.println("Nova categoria do produto: ");
                                categoriaParaAtualizar = entrada.nextLine();

                                gerenciadorProduto.atualizarProdutoCategoria(codigoParaAtualizar, categoriaParaAtualizar);
                                break;
                            case 5:
                                System.out.println("Retornando ao menu principal...");
                                entrada.close();
                                break;
                            default:
                                System.out.println("ERRO: Opção inválida. Tente novamente....");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Informe o código do produto a ser removido: ");
                    String codigoParaRemover = entrada.nextLine();

                    gerenciadorProduto.removerProduto(codigoParaRemover);

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
