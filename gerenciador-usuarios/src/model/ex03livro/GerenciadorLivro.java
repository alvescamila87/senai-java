package model.ex03livro;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe é responsável por gerenciar uma lista de livros.
 */

public class GerenciadorLivro {
    private List<Livro> listaDeLivros = new ArrayList<>();

    public boolean adicionarLivro(Livro livro){
        for (Livro l : listaDeLivros){
            if(livro.getISBN().equals(l.getISBN())) {
                return false;
            }
        }
        listaDeLivros.add(livro);
        return true;
    }

    public List<Livro> listarLivros(){
        return listaDeLivros;
    }

    protected Livro obterLivroPorISBN(String ISBN){
        for (Livro l : listaDeLivros) {
            if(ISBN.equals(l.getISBN())) {
                return l;
            }
        }
        return null;
    }

    public void atualizarLivro(String ISBN, String titulo, String autor, int anoPublicacao){
        Livro livroParaAtualizar = obterLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setTitulo(titulo);
            livroParaAtualizar.setAutor(autor);
            livroParaAtualizar.setAnoDePublicacao(anoPublicacao);
        }
    }
    public void atualizarLivro(String ISBN, String titulo, String autor){
        Livro livroParaAtualizar = obterLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setTitulo(titulo);
            livroParaAtualizar.setAutor(autor);
        }
    }

    public void atualizarLivro(String ISBN, String titulo){
        Livro livroParaAtualizar = obterLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setTitulo(titulo);
        }
    }

    public void atualizarLivroAutor(String ISBN, String autor){
        Livro livroParaAtualizar = obterLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setAutor(autor);
        }
    }

    public boolean removerLivro(String ISBN){
        for(Livro l : listaDeLivros) {
            if(ISBN.equals(l.getISBN())) {
                listaDeLivros.remove(l);
                return true;
            }
        }
        return false;
    }


}
