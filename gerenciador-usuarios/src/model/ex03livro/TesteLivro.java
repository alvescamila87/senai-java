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

                    System.out.println("Titulo de atualização: ");
                    String tituloParaAtualizar = entrada.nextLine();

                    System.out.println("Autor de atualização: ");
                    String autorParaAtualizar = entrada.nextLine();

                    gerenciadorLivro.atualizarLivro(isnbParaAtualizar, tituloParaAtualizar, autorParaAtualizar);

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
