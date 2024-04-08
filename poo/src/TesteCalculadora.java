import models.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora01 = new Calculadora();

        System.out.println("Resultado da adição: " + calculadora01.adiciona(-2,-63));

        System.out.println("Resultado da subtração: " + calculadora01.subtrai(5,3));

        System.out.println("Resultado da multiplicação: " + calculadora01.multiplica(7.3,7.5));

        System.out.println("Resultado da divisão por ZERO: " + calculadora01.divide(10,0));

        System.out.println("Resultado da divisão padrão: " + calculadora01.divide(10,5));
    }
}
