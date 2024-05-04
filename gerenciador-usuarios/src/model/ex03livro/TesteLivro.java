package model.ex03livro;

import java.util.Scanner;
public class TesteLivro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorLivro gl = new GerenciadorLivro();

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
                    if(!gl.adicionarLivro(livroNovo)) {
                        System.out.println("[ERRO] Já existe livro cadastrado com esse ISBN: " + isbnEntrada);
                    } else {
                        System.out.println("Livro cadastrado com sucesso!");
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
