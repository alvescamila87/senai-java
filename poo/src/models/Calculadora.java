package models;

/**
 *   Calculadora com as operações: adição, subtração, multiplicação e divisão com double.
 */
public class Calculadora {

    public double somar(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    public double subtrair(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public double multiplicar(double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }

    public double dividir(double num1, double num2){
        double resultado = 0.0;

        if(num2 == 0){
            System.err.println("ERRO: Não é possível realizar divisão por ZERO!");
            return resultado = 0.0;
        } else {
            return resultado = num1 / num2;
        }

    }

}
