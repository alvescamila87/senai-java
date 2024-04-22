package repeticao.ex01;

public class Pessoa {

    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void falar(){
        System.out.printf("Olá, meu nome é %s e tenho %s anos.", getNome(), getIdade());
    }
}