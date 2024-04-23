import models.GerenciadorUsuario;
import models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorUsuario gu = new GerenciadorUsuario();

        int opcao = 0;

        while (opcao != 6){

            System.out.println("""
                    ------------- MENU -------------
                    [1] Adicionar usuário 
                    [2] Listar todos os usuários 
                    [3] Buscar usuário por ID 
                    [4] Atualizar dados de usuário 
                    [5] Remover usuário por ID 
                    [6] Sair do programa 
                    --------------------------------
                    """);

            System.out.print("Informe a opção do menu: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: // Método adicionar usuário;
                    System.out.println("ID: ");
                    String idEntrada = entrada.next();

                    System.out.println("Nome: ");
                    String nomeEntrada = entrada.next();

                    System.out.println("Email: ");
                    String emailEntrada = entrada.next();

                    Usuario usuario = new Usuario(idEntrada, nomeEntrada, emailEntrada);
                    gu.adicionarUsuario(usuario);

                    break;
                case 2: // Método Listar todos os usuários;
                    gu.obterTodosUsuarios();

                    break;
                case 3: // Método Buscar usuário por ID;
                    System.out.println("Informe o ID do usuário: ");
                    String idUsuario = entrada.next();

                    gu.obterUsuarioPorId(idUsuario);
                    break;
                case 4: // Método Atualizar dados de usuário;
                    System.out.println("ID: ");
                    String idAtualizar = entrada.next();

                    System.out.println("Nome: ");
                    String nomeAtualizar = entrada.next();

                    System.out.println("Email: ");
                    String emailAtualizar = entrada.next();

                    gu.atualizarUsuario(idAtualizar, nomeAtualizar, emailAtualizar);
                    break;
                case 5: // Método Remover usuário por ID;
                    System.out.println("Informe o ID do usuário a ser removido: ");
                    String idUsuarioRemover = entrada.next();

                    gu.removerUsuario(idUsuarioRemover);
                    break;
                case 6: // Sair do programa
                    System.out.println("FIM DE PROGRAMA");
                    break;
                default:
                    System.out.println("[ERRO] Opção inválida! Tente novamente... ");

            }

        }

    }


}