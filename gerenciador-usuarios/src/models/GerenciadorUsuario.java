package models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {

    private List<Usuario> usuario = new ArrayList<>();

    public GerenciadorUsuario() {
    }

    public void adicionarUsuario(Usuario usuario){
        if(!usuario.equals(null)){
            setUsuario(usuario);
            System.out.println("Usuário adicionado com sucesso!");
        } else {
            System.out.println("[ERRO]: Usuário inválido / null...");
        }
    }

    public List<Usuario> obterTodosUsuarios(){
        getUsuario();
        return usuario;
    }

    public List<Usuario> obterUsuarioPorId(String id){
        if(id.equals(id)){

        }
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

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario.add(usuario);
    }
}
