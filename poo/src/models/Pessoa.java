package models;

/**
 * Representa uma pessoa com nome, idade e altura.
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    private String nacionalidade;

    // Construtor com valores padrões
    public Pessoa(){
        this.nome = "Desconhecido";
        this.nacionalidade = "Não especificada";
        this.idade = 0;

        // Imprimir propriedades
        System.out.println("\nINFORMAÇÕES DA PESSOA:");
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
    }

    public Pessoa(String nome, int idade, double altura, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    /**
     * Imprime uma mensagem de saudação no console.
     */
    public void falar(){
        System.out.printf("Olá, meu nome é %s e tenho %. \n", nome, idade);
    }

}
