package professor;

import professor.GerenciadorUsuario;
import professor.Usuario;

import java.util.List;
import java.util.Scanner;

public class TesteUsuarioProfessor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorUsuario guProfessor = new GerenciadorUsuario();

        while (true){
            System.out.println("\nEscolha uma opção");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Listar todos os usuários");
            System.out.println("3. Atualizar usuário");
            System.out.println("4. Remover usuário");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); //Limpa o buffer do scanner

            switch (opcao){
                case 1:
                    System.out.println("ID: ");
                    String id = entrada.nextLine();

                    System.out.println("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.println("e-mail: ");
                    String email = entrada.nextLine();


                    Usuario novoUsuario = new Usuario(id, nome, email);

                    if(!guProfessor.adicionarUsuario(novoUsuario)){ // se NÃO(!) for falso, pois o método adicionar() retorna falso se já existe mesmo ID)
                        System.out.println("Erro: já existe um usuário com esse ID: " + id);
                    } else {
                        System.out.println("Usuário adicionado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Lista de todos os usuários cadastrados");
                    List<Usuario> listaDeUsuariosCadastrados = guProfessor.obterTodosUsuarios();
                    listaDeUsuariosCadastrados.forEach(System.out::println); // reference method - modo 1: de impressão
                    // modo 2: de impressão
                    /*for (Usuario u : listaDeUsuariosCadastrados) {
                        System.out.println(u);
                    }*/
                    break;
                case 3:

                    System.out.println("ID para atualizar: ");
                    String idParaAtualizar = entrada.nextLine();

                    System.out.println("Novo Nome: ");
                    String novoNome = entrada.nextLine();

                    System.out.println("Novo e-mail: ");
                    String novoEmail = entrada.nextLine();

                    guProfessor.atualizarUsuario(idParaAtualizar, novoNome, novoEmail);

                    break;
                case 4:
                    System.out.println ("REMOVER USUÁRIO");
                    System.out.print("ID do usuário para remover: ");
                    String idParaRemover = entrada.nextLine();
                    guProfessor.removerUsuario2(idParaRemover);
                    break;
                case 5:
                    System.out.println("Sai do programa");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente...");
            }

        }

    }
}
