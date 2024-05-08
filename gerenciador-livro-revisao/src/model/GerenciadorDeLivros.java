package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar os livros. Possui uma lista de livros e implementa os métodos
 * CRUD (CREATE, READ, UPDATE, DELETE) para a lista
 */
public class GerenciadorDeLivros {

    private List<Livro> listaDeLivros = new ArrayList<>();

    /**
     * Construtor da classe Gerenciador de livros.
     * A Lista já foi inicializada dentro do atributo da classe, não é necessário passar por parâmetro.
     */
    public GerenciadorDeLivros(){}

    /**
     * Método responsável por adicionar um livro à lista de Livros.
     * É usado o método .add da Classe ArrayList para adicionar.
     * Não pode ser adicionando um livro com o ISBN igual à um existente na lista.
     * Para isso, a lista é iterada e o ISBN do livro dentro da lista é comparada com o ISBN do parãmetro livro.
     * Será utilizado o método .equals da classe String para fazer a comparação.
     * @param livro Objeto do tipo Livro que será adicionando.
     */
    public void adicionarLivro(Livro livro){
        for (Livro l : listaDeLivros){
            if(livro.getISBN().equals(l.getISBN())){
                System.out.println("ERRO: Livro já adicionado!");
            } else {
                listaDeLivros.add(livro);
                System.out.println("Livro adicoinado com sucesso");
            }
        }
    }

}
