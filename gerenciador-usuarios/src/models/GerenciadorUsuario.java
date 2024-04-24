package models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public GerenciadorUsuario() {
    }

    public void adicionarUsuario(Usuario usuario){
        if(!usuario.equals(null)){
            this.usuarios.add(usuario);
            System.out.println("Usuário adicionado com sucesso!");
        } else {
            System.out.println("[ERRO]: Usuário inválido / null...");
        }
    }

    public List<Usuario> obterTodosUsuarios(){
        System.out.println("LISTA DE USUÁRIOS");
        System.out.println("-----------------------------------");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i));
        }
        return usuarios;
    }

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

    public void atualizarUsuario(List<Usuario> listaUsuarios, String id, String novoNome, String novoEmail){
        for(Usuario usuario : listaUsuarios){
            if(usuario.getId().equals(id)){
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                System.out.println("Usuário atualizado com sucesso");
                return;
            }
        }
        System.out.println("ID: " + id + " não encontrado!");
        return;
    }

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
