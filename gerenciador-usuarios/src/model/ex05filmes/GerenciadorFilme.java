package model.ex05filmes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFilme {
    private List<Filme> listaDeFilmes = new ArrayList<>();

    public boolean adicionarFilme(Filme filme){
        for(Filme f : listaDeFilmes) {
            if(filme.getCodigo().equals(f.getCodigo())){
                return false;
            }
        }
        listaDeFilmes.add(filme);
        return true;
    }

    public List<Filme> listarFilmes(){
        return listaDeFilmes;
    }

    private Filme listarFilmePorCodigo(String codigo){
        for (Filme filme : listaDeFilmes){
            if (codigo.equals(filme.getCodigo())){
                return filme;
            }
        }
        return null;
    }

    public void atualizarFilme(String codigo, String titulo, String diretor, int anoLancamento){
        Filme filmeParaAtualizar = listarFilmePorCodigo(codigo);
        if (filmeParaAtualizar != null) {
            filmeParaAtualizar.setTitulo(titulo);
            filmeParaAtualizar.setDiretor(diretor);
            filmeParaAtualizar.setAnoLancamento(anoLancamento);
        }
    }

    public boolean removerFilme(String codigo){
        for (Filme filme : listaDeFilmes) {
            if(codigo.equals(filme.getCodigo())){
                listaDeFilmes.remove(filme);
                return true;
            }
        }
        return false;
    }

}
