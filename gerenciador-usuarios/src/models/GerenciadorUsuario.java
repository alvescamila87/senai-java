package models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {

    private List<Usuario> usuario = new ArrayList<>();

    public void adicionaUsuario(Usuario usuario){
        // adicionar usuário;
    }

    public List<Usuario> obterTodosUsuarios(){
        // retornar todos os usuários
        return usuario;
    }

    public List<Usuario> obterUsuarioPorId(String id){
        // retornar usuário por id
        return usuario;
    }

    public void atualizarUsuario(String id, String novoNome, String novoEmail){
        // atualiza informações de usuário
        System.out.println("Usuário atualizado com sucesso.");
    }

    public String removerUsuario(String id){
        return id;
    }

    @Override
    public String toString() {
        return "GerenciadorUsuario {" +
                "usuario =" + usuario +
                '}';
    }
}
