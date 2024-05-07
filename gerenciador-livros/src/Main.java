import model.GerenciadorLivro;
import model.Livro;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();

        while(true){
            System.out.println("""
                    ------------MENU-------------                       
                    [1] Adicionar livro
                    [2] Listar livros
                    [3] Atualizar livro
                    [4] Excluir livro
                    [5] Sair do programa
                    """);
            System.out.println("Opção do menu: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("CADASTRAR NOVO LIVRO");
                    System.out.println("---------------------------");

                    System.out.println("Código de ISBN: ");
                    String isbn = entrada.nextLine();

                    System.out.println("Título do livro: ");
                    String titulo = entrada.nextLine();

                    System.out.println("Autor do livro: ");
                    String autor = entrada.nextLine();

                    System.out.println("Ano publicação do livro: ");
                    int anoPublicacao = entrada.nextInt();
                    entrada.nextLine();

                    Livro novoLivro = new Livro(isbn, titulo, autor, anoPublicacao);

                    if(!gerenciadorLivro.adicionarLivro(novoLivro)){
                        System.out.println("Livro já cadastrado com esse código de ISBN: " + isbn);
                    } else {
                        System.out.println("Livro cadastrado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("LISTA DE LIVROS CADASTRADOS");
                    System.out.println("---------------------------------------");

                    List<Livro> listaDeLivrosCadastrados = gerenciadorLivro.listarLivros();

                    for (Livro livro : listaDeLivrosCadastrados) {
                        System.out.println(livro);
                    }

                    break;
                case 3:
                    System.out.println("ATUALIZAÇÃO DE LIVRO");
                    System.out.println("-------------------------------------------------------------");

                    System.out.println("Informe o código de ISBN do livro a ser atualizado: ");
                    String isbnParaAtualizar = entrada.nextLine();

                    if(gerenciadorLivro.listarLivroPorISBN(isbnParaAtualizar) != null) {

                        int opcaoAtualicacao = 0;

                        while (opcaoAtualicacao != 4) {

                            System.out.println("""
                                    --------------MENU DE ATUALIZAÇÃO--------------                                   
                                    [1] Atualizar informações de Título e Autor
                                    [2] Atualizar somente Título
                                    [3] Atualizar somente Autor
                                    [4] Sair e retornar ao menu principal 
                                    """);
                            System.out.println("Opção do menu: ");
                            opcaoAtualicacao = entrada.nextInt();
                            entrada.nextLine();

                            switch (opcaoAtualicacao) {
                                case 1:
                                    System.out.println("Novo título do livro: ");
                                    String tituloParaAtualizar = entrada.nextLine();

                                    System.out.println("Novo autor do livro: ");
                                    String autorParaAtualizar = entrada.nextLine();

                                    gerenciadorLivro.atualizarLivro(isbnParaAtualizar, tituloParaAtualizar, autorParaAtualizar);
                                    opcaoAtualicacao = 4;
                                    break;
                                case 2:
                                    System.out.println("Novo título do livro: ");
                                    tituloParaAtualizar = entrada.nextLine();

                                    gerenciadorLivro.atualizarLivro(isbnParaAtualizar, tituloParaAtualizar);
                                    opcaoAtualicacao = 4;
                                    break;
                                case 3:
                                    System.out.println("Novo autor do livro: ");
                                    autorParaAtualizar = entrada.nextLine();

                                    gerenciadorLivro.atualizarLivroAutor(isbnParaAtualizar, autorParaAtualizar);
                                    opcaoAtualicacao = 4;
                                    break;
                                case 4:
                                    System.out.println("Retornando ao menu principal...");
                                    break;
                                default:
                                    System.out.println("[ERROR] Opção inválida. Tente novamente...");
                            }
                        }
                    } else {
                        System.out.println("Código de ISBN inexistente!");
                    }

                    break;
                case 4:
                    System.out.println("EXCLUIR LIVRO");
                    System.out.println("----------------------------");

                    System.out.println("Informe o código de ISBN do livro a ser excluído: ");
                    String isbnParaExcluir = entrada.nextLine();

                    if(gerenciadorLivro.listarLivroPorISBN(isbnParaExcluir) != null) {
                        gerenciadorLivro.removerLivro(isbnParaExcluir);
                        System.out.println("Livro excluído com sucesso!");
                    } else {
                        System.out.println("Código de ISBN inexistente!");
                    }


                    break;
                case 5:
                    System.out.println("SAINDO DO PROGRAMA...");
                    entrada.close();
                    return;
                default:
                    System.out.println("[ERROR] Opção inválida. Tente novamente...");
            }
        }


    }
}