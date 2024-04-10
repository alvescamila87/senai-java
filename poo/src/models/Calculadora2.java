package models;

public class Calculadora2 implements OperacoesMatematicas {


    @Override
    public double somar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    @Override
    public double subtrair(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    @Override
    public double dividir(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não é possível realizar divisão por ZERO.");
            return 0;
        } else {
            double resultado = num1 / num2;
            return resultado;
        }

    }

    @Override
    public double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }
}
