package model.ex02carro;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe é responsável por gerenciar uma lista de carros.
 */

public class GerenciadorCarro {

    private List<Carro> listaDeCarros = new ArrayList<>();

    /**
     * Adiciona um novo carro à lista de carros, verificando se a placa já está em uso.
     * @param carro O carro a ser adicionado.
     * @return true se o carro foi adicionado com sucesso, false se a placa já está em uso.
     */
    public boolean adicionarCarro(Carro carro){
        for (Carro c : listaDeCarros) {
            if(carro.getPlaca().equals(c.getPlaca())) {
                return false;
            }
        }
        listaDeCarros.add(carro);
        return true;

    }

    /**
     * Retorna a lista de todos os carros.
     * @return A lista de carros.
     */
    public List<Carro> obterTodosCarros(){
        return listaDeCarros;
    }

    /**
     * Obtém um carro com base em sua placa.
     * @param placa A placa do carro a ser obtido.
     * @return O carro com a placa especificada, ou null se não for encontrado.
     */
    private Carro obterCarroPorPlaca(String placa){
        for(Carro c : listaDeCarros) {
            if(c.getPlaca().equals(placa)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Atualiza o modelo e a cor de um carro com base em sua placa.
     * @param placa A placa do carro a ser atualizado.
     * @param novoModelo O novo modelo do carro.
     * @param novaCor A nova cor do carro.
     */
    public void atualizarCarro(String placa, String novoModelo, String novaCor){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setModelo(novoModelo);
            carroParaAtualizar.setCor(novaCor);
        }

    }

    /**
     * Atualiza o modelo de um carro com base em sua placa.
     * @param placa A placa do carro a ser atualizado.
     * @param novoModelo O novo modelo do carro.
     */
    public void atualizarCarro(String placa, String novoModelo){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setModelo(novoModelo);
            carroParaAtualizar.setModelo("Sem cor");
        }

    }

    /**
     * Atualiza a cor de um carro com base em sua placa.
     * @param placa A placa do carro a ser atualizado.
     * @param novaCor A nova cor do carro.
     */
    public void atualizarCarroCor(String placa, String novaCor){
        Carro carroParaAtualizar = obterCarroPorPlaca(placa);
        if(carroParaAtualizar != null) {
            carroParaAtualizar.setCor(novaCor);
        }

    }

    /**
     * Remove um carro com base em sua placa.
     * @param placa A placa do carro a ser removido.
     * @return 1 se o carro foi removido com sucesso, -1 se o carro não foi encontrado.
     */
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
