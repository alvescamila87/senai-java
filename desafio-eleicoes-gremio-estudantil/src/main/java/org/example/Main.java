package org.example;

import java.util.Scanner;

public class Main {

    public static void computarVotos(Scanner entrada, int voto) {

        int opcaoMenu2 = -1;

        while(true) {
            System.out.println("""
                    ----------MENU DE CANDIDATOS ------------
                    [0] - Nulo
                    [1] - Chapa 1: Ana
                    [2] - Chapa 2: Pedro
                    [3] - Chapa 3: Rita
                    [4] - Chapa 4: Alfredo
                    [5] - Chapa 5: Regina
                    [6] - Chapa 6: Ricardo
                    [10] - Em branco 
                    [11] - Sair / Retornar ao menu anterior
                    -----------------------------------------
                    """);
            System.out.print("");
            System.out.print("Informe sua opção de voto: ");
            opcaoMenu2 = entrada.nextInt();
            entrada.nextLine();

            if(opcaoMenu2 == 11) {
                return;
            }

            switch (opcaoMenu2) {
                case 0:
                    System.out.println("Voto NULO");
                    break;
                case 1:
                    System.out.println("Voto Ana");
                    break;
                case 2:
                    System.out.println("Voto Pedro");
                    break;
                case 3:
                    System.out.println("Voto Rita");
                    break;
                case 4:
                    System.out.println("Voto Alfredo");
                    break;
                case 5:
                    System.out.println("Voto Regina");
                    break;
                case 6:
                    System.out.println("Voto Ricardo");
                    break;
                case 10:
                    System.out.println("Voto BRANCO");
                    break;
                default:
                    System.err.println("[ERRO] Opção de voto inválida! Tente novamente... ");
            }
        }



    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcaoMenu1 = 1;
        String turma[] = new String[50];
        int votos[] = new int[50];
        int opcaoVoto = -1;

        while(true) {

            System.out.println("""
                    ----------------- MENU -------------------
                    [1] - Votar
                    [2] - Relatório de votos
                    [3] - Sair
                    -----------------------------------------
                    """);
            System.out.print("");
            System.out.print("Informe a opção: ");
            opcaoMenu1 = entrada.nextInt();
            entrada.nextLine();

            if(opcaoMenu1 == 3) {
                System.out.println("FIM DO PROGRAMA! 1");
                break;
            }

            switch (opcaoMenu1) {
                case 1:
                    computarVotos(entrada, opcaoVoto);
                    break;
                case 2:
                    break;
                default:
                    System.err.println("[ERRO]: Opção inválida! Tente novamente...");

            }
        }
    }


}