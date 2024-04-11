import models.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora01 = new Calculadora();

        System.out.println("Resultado da adição: " + calculadora01.somar(-2,-63));

        System.out.println("Resultado da subtração: " + calculadora01.subtrair(5,3));

        System.out.println("Resultado da multiplicação: " + calculadora01.multiplicar(7.3,7.5));

        System.out.println("Resultado da divisão por ZERO: " + calculadora01.dividir(10,0));

        System.out.println("Resultado da divisão padrão: " + calculadora01.dividir(10,5));
    }
}
