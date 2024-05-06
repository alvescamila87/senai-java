package model.ex04produtos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public boolean adicionarProduto(Produto produto){
        for (Produto p : listaDeProdutos) {
            if(produto.getCodigo().equals(p.getCodigo())){
                return false;
            }
        }
        listaDeProdutos.add(produto);
        return true;
    }

    public List<Produto> listarProdutos() {
        return listaDeProdutos;
    }

    private Produto listarProdutoPorCodigo(String codigo) {
        for (Produto produto : listaDeProdutos) {
            if(codigo.equals(produto.getCodigo())){
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(String codigo, String nome, String categoria, double preco){
        Produto produtoAtualizar = listarProdutoPorCodigo(codigo);
        if(produtoAtualizar != null) {
            produtoAtualizar.setCategoria(nome);
            produtoAtualizar.setCategoria(categoria);
            produtoAtualizar.setPreco(preco);
        }
    }
    public void atualizarProduto(String codigo, String categoria, double preco){
        Produto produtoAtualizar = listarProdutoPorCodigo(codigo);
        if(produtoAtualizar != null) {
            produtoAtualizar.setCategoria(categoria);
            produtoAtualizar.setPreco(preco);
        }
    }

    public void atualizarProduto(String codigo, double preco) {
        Produto produtoAtualizar = listarProdutoPorCodigo(codigo);
        if(produtoAtualizar != null) {
            produtoAtualizar.setPreco(preco);
        }
    }

    public void atualizarProdutoCategoria(String codigo, String categoria) {
        Produto produtoAtualizar = listarProdutoPorCodigo(codigo);
        if(produtoAtualizar != null) {
            produtoAtualizar.setCategoria(categoria);
        }
    }

    public boolean removerProduto(String codigo) {
        for(Produto produto : listaDeProdutos) {
            if(codigo.equals(produto.getCodigo())) {
                listaDeProdutos.remove(produto);
                return true;
            }
        }
        return false;
    }
}
