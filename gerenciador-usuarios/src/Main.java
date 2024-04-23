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
                case 2: // metodo Listar todos os usuários;
                    System.out.println("metodo Listar todos os usuários");
                    break;
                case 3: // metodo Buscar usuário por ID;
                    System.out.println("metodo Buscar usuário por ID");
                    break;
                case 4: // metodo Atualizar dados de usuário;
                    System.out.println("metodo Atualizar dados de usuário"); ;
                    break;
                case 5: // metodo Remover usuário por ID;
                    System.out.println("metodo Remover usuário por ID"); ;
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