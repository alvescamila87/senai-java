package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um gerenciados de livros através de uma lista (simulando um banco de dados).
 */
public class GerenciadorLivro {

    private List<Livro> listaDeLivros = new ArrayList<>();

    /**
     * Adiciona o registro de livro
     * @param livro com isbn, titulo, autor e ano de publicação
     * @return verdadeiro se adicionar o livro ou false se id já for existente
     */
    public boolean adicionarLivro(Livro livro){
        for (Livro l : listaDeLivros){
            if(livro.getISBN().equals(l.getISBN())){
                return false;
            }
        }
        listaDeLivros.add(livro);
        return true;
    }

    /**
     * Lista todos os livros cadastrados
     * @return a lista de livros cadastrados
     */
    public List<Livro> listarLivros(){
        return listaDeLivros;
    }

    /**
     * Lista o livro por código
     * @return o livro por código de ISBN
     */
    public Livro listarLivroPorISBN(String ISBN){
        for (Livro livro : listaDeLivros){
            if(ISBN.equals(livro.getISBN())){
                return livro;
            }
        }
        return null;
    }

    /**
     * Atualiza as informações do livro
     * @param ISBN código do livro
     * @param titulo do livro
     * @param autor do livro
     */
    public void atualizarLivro(String ISBN, String titulo, String autor){
        Livro livroParaAtualizar = listarLivroPorISBN(ISBN);
        if(livroParaAtualizar != null && ISBN.equals(livroParaAtualizar.getISBN())) {
            livroParaAtualizar.setTitulo(titulo);
            livroParaAtualizar.setAutor(autor);
        }
    }

    /**
     * Atualiza as informações do livro
     * @param ISBN código do livro
     * @param titulo do livro
     */
    public void atualizarLivro(String ISBN, String titulo){
        Livro livroParaAtualizar = listarLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setTitulo(titulo);
        }
    }

    /**
     * Atualiza as informações do livro
     * @param ISBN código do livro
     * @param autor do livro
     */
    public void atualizarLivroAutor(String ISBN, String autor){
        Livro livroParaAtualizar = listarLivroPorISBN(ISBN);
        if(livroParaAtualizar != null) {
            livroParaAtualizar.setAutor(autor);
        }
    }

    /**
     * Remove o registro de livro
     * @param ISBN código do livro
     * @return true se remover o livro, ou false se não encontrar o id para remoção
     */
    public boolean removerLivro(String ISBN){
        for (Livro livro : listaDeLivros){
            if (ISBN.equals(livro.getISBN())){
                listaDeLivros.remove(livro);
                return true;
            }
        }
        return false;
    }
}
