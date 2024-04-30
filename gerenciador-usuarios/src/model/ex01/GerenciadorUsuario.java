package model.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um gerenciador de usuários com acesso ao sistema;
 */
public class GerenciadorUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public GerenciadorUsuario() {
    }

    /**
     * Permite adicionar um usuário à lista de usuários do gerenciador de usuários
     * @param usuario recebe um tipo usuário com: id, nome e e-mail informados pelo usuário no main;
     */
    public void adicionarUsuario(Usuario usuario){
        for (Usuario u : usuarios){
            if (u.getId().equals(usuario.getId())) {
                System.out.println("ID: " + usuario.getId() + " já existente.");
                return;
            }
        }
        this.usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    /**
     * Permite listar todos os usuários da lista de usuários do gerenciador
     */
    public List<Usuario> obterTodosUsuarios(){
        System.out.println("LISTA DE USUÁRIOS");
        System.out.println("-----------------------------------");
        for(Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return usuarios;
    }


    /**
     * Permite listar o usuário específico por ID
     * @param listaUsuarios recebe um tipo usuário com: id, nome e e-mail informados pelo usuário no main;
     * @param id recebe o id informado pelo usuário no main para comparar se já existe na lista de usuários;
     * @return -1 se o id de usuário pesquisado não for encontrado;
     */
    public int obterUsuarioPorId(List<Usuario> listaUsuarios, String id){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).getId().equals(id)) {
                System.out.println("""
                        INFORMAÇÕES DE USUÁRIO POR ID:
                        -------------------------------------
                        """ +
                        listaUsuarios.get(i).toString());
                return i;
            }
        }
        System.out.println("ID: " + id + " não encontrado!");
        return -1;
    }

    /**
     * Permite atualizar a lista de usuário a partir do usuário específico por ID
     * @param listaUsuarios recebe um tipo usuário com: id, nome e e-mail informados pelo usuário no main;
     * @param id recebe o id informado pelo usuário no main para comparar se já existe na lista de usuários;
     * @return -1 se o id de usuário pesquisado não for encontrado;
     */
    public void atualizarUsuario(List<Usuario> listaUsuarios, String id, String novoNome, String novoEmail){
        for(Usuario usuario : listaUsuarios){
            if(usuario != null && usuario.getId().equals(id)){
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                System.out.println("Usuário atualizado com sucesso");
                return;
            }
        }
        System.out.println("ID: " + id + " não encontrado!");
    }

    /**
     * Permite remover o usuário específico por ID da lista de usuário
     * @param listaUsuarios recebe um tipo usuário com: id, nome e e-mail informados pelo usuário no main;
     * @param id recebe o id informado pelo usuário no main para comparar se já existe na lista de usuários;
     * @return -1 se o id de usuário pesquisado não for encontrado;
     */
    public int removerUsuario(List<Usuario> listaUsuarios, String id){
        for(int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).getId().equals(id)){
                listaUsuarios.remove(i);
                System.out.println("Usuário removido com sucesso!");
                return i;
            }
        }
        System.out.println("ID: " + id + " não encontrado!");
        return -1;
    }

}
