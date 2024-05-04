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


}
