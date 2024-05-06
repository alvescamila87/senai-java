package model.ex03livro;

import java.util.List;
import java.util.Scanner;
public class TesteLivro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();

        while(true){

            System.out.println("""
                                   MENU
                    -----------------------------------
                    [1] Adicionar livro
                    [2] Listar livros
                    [3] Atualizar livro
                    [4] Excluir livro
                    [5] Sair do programa                    
                    """);
            System.out.print("Informe uma opção do menu: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("ISBN: ");
                    String isbnEntrada = entrada.nextLine();

                    System.out.println("Título: ");
                    String tituloEntrada = entrada.nextLine();

                    System.out.println("Autor: ");
                    String autorEntrada = entrada.nextLine();

                    System.out.println("Ano de publicação: ");
                    int anoLivro = entrada.nextInt();
                    entrada.nextLine();

                    Livro livroNovo = new Livro(isbnEntrada, tituloEntrada, autorEntrada, anoLivro);
                    if(!gerenciadorLivro.adicionarLivro(livroNovo)) {
                        System.out.println("[ERRO] Já existe livro cadastrado com esse ISBN: " + isbnEntrada);
                    } else {
                        System.out.println("Livro cadastrado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("LISTA DE LIVROS CADASTRADOS");
                    System.out.println("------------------------------------------");

                    List<Livro> listaDeLivrosCadastrados = gerenciadorLivro.listarLivros();

                    for (Livro livro : listaDeLivrosCadastrados) {
                        System.out.println(livro);
                    }

                    break;
                case 3:
                    System.out.println("Informe o ISBN do livro a ser atualizado: ");
                    String isnbParaAtualizar = entrada.nextLine();

                    int opcaoAtualização = 0;

                    while (opcaoAtualização != 4) {

                        System.out.println("""
                                [1] Atualiza todas as informações de livro
                                [2] Atualiza somente título
                                [3] Atualiza somente autor
                                [4] Atualiza somente titulo e autor
                                [5] Sair e retornar ao menu principal
                                """);

                        switch (opcaoAtualização) {
                            case 1:
                                System.out.println("Novo titulo: ");
                                String tituloParaAtualizar = entrada.nextLine();

                                System.out.println("Novo autor: ");
                                String autorParaAtualizar = entrada.nextLine();

                                System.out.println("Novo ano de publicação: ");
                                int anoParaAtualizar = entrada.nextInt();

                                gerenciadorLivro.atualizarLivro(isnbParaAtualizar, tituloParaAtualizar, autorParaAtualizar, anoParaAtualizar);

                                break;
                            case 2:
                                System.out.println("Novo titulo: ");
                                tituloParaAtualizar = entrada.nextLine();

                                gerenciadorLivro.atualizarLivro(isnbParaAtualizar, tituloParaAtualizar);
                                break;
                            case 3:
                                System.out.println("Novo autor: ");
                                autorParaAtualizar = entrada.nextLine();

                                gerenciadorLivro.atualizarLivroAutor(isnbParaAtualizar, autorParaAtualizar);
                                break;
                            case 4:
                                System.out.println("Novo titulo: ");
                                tituloParaAtualizar = entrada.nextLine();

                                System.out.println("Novo autor: ");
                                autorParaAtualizar = entrada.nextLine();

                                gerenciadorLivro.atualizarLivro(isnbParaAtualizar, tituloParaAtualizar, autorParaAtualizar);
                                break;
                            case 5:
                                System.out.println("Retornando ao menu principal...");
                                break;
                            default:
                                System.out.println("ERRO: Opção inválida, tente novamente... ");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Informe o ISBN do livro a ser excluído: ");
                    String isnbParaExcluir = entrada.nextLine();

                    gerenciadorLivro.removerLivro(isnbParaExcluir);
                    break;
                case 5:
                    System.out.println("FIM DO PROGRAMADA!");
                    entrada.close();
                    return; // termina imediatamente
                default:
                    System.out.println("[ERR] Opção inválida. Tente novamente... ");
            }

        }

    }
}
