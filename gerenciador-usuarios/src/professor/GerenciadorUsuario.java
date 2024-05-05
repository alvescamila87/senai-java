package professor;

import java.util.ArrayList;
import java.util.List;

/**
 * EXEMPLO DO PROFESSOR
 */
public class GerenciadorUsuario {

    private List<Usuario> listaDeUsuarios = new ArrayList<>();

    public boolean adicionarUsuario(Usuario usuario){
        for (Usuario u : listaDeUsuarios){
            if (u.getId().equals(usuario.getId())) {
                return false;
            }
        }
        listaDeUsuarios.add(usuario);
        return true;
    }

    public List<Usuario> obterTodosUsuarios(){
        return listaDeUsuarios;
    }

    private Usuario obterUsuarioPorId(String id){
        for (Usuario u : listaDeUsuarios) {
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }

    public void atualizarUsuario(String idAtualizar, String novoNome, String novoEmail){
        Usuario usuarioParaAtualizar = obterUsuarioPorId(idAtualizar);
        if(usuarioParaAtualizar != null) {
            usuarioParaAtualizar.setNome(novoNome);
            usuarioParaAtualizar.setEmail(novoEmail);
        }
    }

    public void atualizarUsuario(String idParaAtualizar, String novoNome){
        Usuario usuarioParaAtualizar = obterUsuarioPorId(idParaAtualizar);
        if(usuarioParaAtualizar != null) {
            usuarioParaAtualizar.setNome(novoNome);
        }
    }

    public void atualizarUsuarioEmail(String id, String novoEmail){
        Usuario usuarioParaAtualizar = obterUsuarioPorId(id);
        if(usuarioParaAtualizar != null) {
            usuarioParaAtualizar.setEmail(novoEmail);
        }
    }

    public void removerUsuario(String id) {
        listaDeUsuarios.removeIf(usuario -> usuario.getId().equals(id)); // lambda expression
    }

    // modo 2: fazer igual
    public boolean removerUsuario2(String id){
        for (Usuario u : listaDeUsuarios) {
            if(id.equals(u.getId())){
                listaDeUsuarios.remove(u); // remove o usuário pelo objeto 'u'
                return true;
            }
        }
        return false;
    }
}
