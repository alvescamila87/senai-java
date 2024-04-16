package repeticao.ex04;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println(somar(15, 15));
        System.out.println(subtrair(15, 3));
        System.out.println(multiplicar(8, 8));
        System.out.println(dividir(10, 0));
        System.out.println(dividir(10, 5));

    }

    static double somar(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    static double subtrair(double num1, double num2){
        double resultado = num1 - num2;
        return resultado;
    }

    static double multiplicar(double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }

    static double dividir(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não é possível realizar divisão por ZERO!");
            return 0.0;
        } else {
            double resultado = num1 / num2;
            return resultado;
        }
    }
}
