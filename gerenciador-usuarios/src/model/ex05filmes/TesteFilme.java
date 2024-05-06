package model.ex05filmes;

import java.util.List;
import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorFilme gerenciadorFilme = new GerenciadorFilme();

        while(true){

            System.out.println("""
                    [1] Adicionar filme
                    [2] Listar filmes
                    [3] Atualizar fulme
                    [4] Remover filme
                    [5] Sair do programa
                    """);
            System.out.println("Opção do menu: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("NOVO FILME");
                    System.out.println("---------------------------");

                    System.out.println("Código: ");
                    String codigo = entrada.nextLine();

                    System.out.println("Título: ");
                    String titulo = entrada.nextLine();

                    System.out.println("Diretor: ");
                    String diretor = entrada.nextLine();

                    System.out.println("Ano de lançamento: ");
                    int anoLancamento = entrada.nextInt();
                    entrada.nextLine();

                    Filme novoFilme = new Filme(codigo, titulo, diretor, anoLancamento);

                    if(!gerenciadorFilme.adicionarFilme(novoFilme)) {
                        System.out.println("Filme já cadastrado com esse código: " + codigo);
                    } else {
                        System.out.println("Filme cadastrado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("LISTAR FILME");
                    System.out.println("---------------------------");
                    List<Filme> listaDeFilmesCadastrados = gerenciadorFilme.listarFilmes();
                    for (Filme filme : listaDeFilmesCadastrados) {
                        System.out.println(filme);
                    }
                    break;
                case 3:
                    System.out.println("ATUALIZAÇÃO DE FILME");
                    System.out.println("---------------------------");

                    System.out.println("Código do filme a ser atualizado: ");
                    String codigoParaAtualizar = entrada.nextLine();

                    System.out.println("Novo título: ");
                    String tituloParaAtualizar = entrada.nextLine();

                    System.out.println("Novo diretor: ");
                    String diretorParaAtualizar = entrada.nextLine();

                    System.out.println("Novo ano de lançamento:  ");
                    int anoLancamentoParaAtualizar = entrada.nextInt();
                    entrada.nextLine();

                    gerenciadorFilme.atualizarFilme(codigoParaAtualizar, tituloParaAtualizar, diretorParaAtualizar, anoLancamentoParaAtualizar);

                    break;
                case 4:
                    System.out.println("REMOVER FILME");
                    System.out.println("----------------------------");
                    System.out.println("Código do filme a ser removido: ");
                    String codigoParaRemover = entrada.nextLine();
                    gerenciadorFilme.removerFilme(codigoParaRemover);
                    break;
                case 5:
                    System.out.println("SAINDO DO PROGRAMA!");
                    entrada.close();
                    return;
                default:
                    System.out.println("ERRO: Opção inválida. Tente novamente...");

            }

        }
    }

}
