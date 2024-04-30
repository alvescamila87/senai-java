package model.ex02;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCarro {

    private List<Carro> listaDeCarros = new ArrayList<>();

    public boolean adicionarCarro(Carro carro){
        for (Carro c : listaDeCarros) {
            if(carro.getPlaca().equals(c.getPlaca())) {
                return false;
            }
        }
        listaDeCarros.add(carro);
        return true;

    }

    public List<Carro> obterTodosCarros(){
        return listaDeCarros;
    }

    private Carro obterCarroPorPlaca(String placa){
        for(Carro c : listaDeCarros) {
            if(c.getPlaca().equals(placa)) {
                return c;
            }
        }
        return null;
    }
    public void atualizarCarro(String placa, String novoModelo, String novaCor){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setModelo(novoModelo);
            carroParaAtualizar.setCor(novaCor);
        }

    }

    public void atualizarCarro(String placa, String novoModelo){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setModelo(novoModelo);
        }

    }

    public void atualizarCarroCor(String placa, String novaCor){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setCor(novaCor);
        }

    }

    public int removerCarro(String placa){
        for(Carro c : listaDeCarros) {
            if(c.getPlaca().equals(placa)) {
                listaDeCarros.remove(placa);
                return 1;
            }
        }
        return -1;
    }
}
