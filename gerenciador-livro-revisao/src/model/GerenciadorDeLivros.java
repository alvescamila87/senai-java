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

    /**
     * Retorna todos os livros dentro da lista de livros.
     * @return listaDeLivros a ser retornada.
     */
    public List<Livro> listarTodosivros1(){
        if(listaDeLivros.isEmpty()) {
            System.out.println("Não há livros cadastrados");
            return listaDeLivros;
        }
        return listaDeLivros;
    }

    public void listarTodosLivros2(){
        if(listaDeLivros.isEmpty()) {
            System.out.println("Não há livros cadastrados");
        }
        listaDeLivros.forEach(System.out::println);
    }

    public void listarTodosLivros3(){
        if(listaDeLivros.isEmpty()){
            System.out.println("Não há livros cadastrados");
        }
        for(Livro livro : listaDeLivros){
            System.out.println(livro);
        }
    }

    public void listarTodosLivros4(){
        if(listaDeLivros.isEmpty()) {
            System.out.println("Não há livros cadastrados");
        }
        for (int i = 0; i < listaDeLivros.size(); i++) {
            System.out.println(listaDeLivros.get(i));
        }
    }

    /**
     * Método responsável por retornar um livro. A lista de livros é iterada e o
     * método .equals da classe String é utilizada para comparar o ISBN fornecido com o .getISBN de
     * cada livr dentro da lista. Se não houver com o ISBN correspondete, retorna null.
     * Deve ser tratado onde for usado.
     * @param ISBN que está sendo buscado
     * @return livro que tem o ISBN igual ao buscado
     */
    private Livro listarLivroPorISBN(String ISBN){
        for (Livro livro : listaDeLivros) {
            if(ISBN.equals(livro.getISBN())){
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    /**
     * Método responsável por atualizar todos os parâmetros de um livro.
     *
     * @param ISBN
     * @param titulo
     * @param autor
     * @param anoDePublicao
     */
    public void atualizarLivro(String ISBN, String titulo, String autor, int anoDePublicao){
        Livro livroParaAtualizar = listarLivroPorISBN(ISBN);
        if(livroParaAtualizar == null) {
            System.out.println("Esse livro não foi cadastrado.");
        } else {
            livroParaAtualizar.setTitulo(titulo);
            livroParaAtualizar.setAutor(autor);
            livroParaAtualizar.setAnoDePublicacao(anoDePublicao);
            System.out.println("Livro atualizado com sucesso!");
        }

    }

    /**
     *
     * @param ISBN
     */
    public void removerLivro1(String ISBN) {
        Livro livroParaRemover = listarLivroPorISBN(ISBN);
        if(livroParaRemover == null) {
            System.out.println("Este livro não está cadastrado.");
        } else {
            listaDeLivros.remove(livroParaRemover);
            System.out.println("Livro removido com sucesso.");
        }
    }

    /**
     * Método reponsável por remover um livro da lista. É utilizdo um predicado (lambda),
     * o método .removeIf(), para comparar o ISBN informado com todos os livros da lista e remover se encontrado.
     * Caso não seja encontrado, uma mensagem é exibida para o usuário.
     * @param ISBN identificador para ser utilizado no método de
     */

    public void removerLivro2(String ISBN){
        boolean livroParaRemover = listaDeLivros.removeIf(livro -> livro.getISBN().equals(ISBN));

        if(livroParaRemover) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro com ISBN " + ISBN + " não encontrado!");
        }
    }

}
