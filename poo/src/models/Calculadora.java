package models;

import java.beans.PropertyEditorSupport;

/**
 *   Calculadora com as operações: adição, subtração, multiplicação e divisão com double.
 */
public class Calculadora {

    public double adiciona(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    public double subtrai(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public double multiplica(double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }

    public double divide(double num1, double num2){
        double resultado = 0.0;

        if(num2 == 0){
            System.out.println("ERRO: Não é possível realizar divisão por ZERO!");
            return resultado = 0.0;
        } else {
            return resultado = num1 / num2;
        }

    }

}
