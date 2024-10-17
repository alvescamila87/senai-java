package org.example;

import java.util.Scanner;

public class Main {

    static String turma[] = new String[50];
    static int votos[] = new int[50];
    static int votosChapa1 = 0;
    static int votosChapa2 = 0;
    static int votosChapa3 = 0;
    static int votosChapa4 = 0;
    static int votosChapa5 = 0;
    static int votosChapa6 = 0;
    static int votosEmBranco = 0;
    static int votosNulo = 0;
    static int votosInvalidos = 0;


    // quantidade de votos: total de eleitores
    /* para quem votou:
        - votos válidos (saber a chapa)
        - votos nulos
        - em branco

        opção 1
        - array de votos em branco
        - array de votos nulos
        - array de votos válidos

        opção 2:
        - usar um único array para computar

     */


    public static void menu(Scanner entrada, int opcaoMenu) {
        int opcaoMenu1 = 1;
        int opcaoVoto = -1;

        while(true) {

            System.out.println("""
                    ------------ MENU PRINCIPAL -------------
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
                System.out.println("FIM DO PROGRAMA!");
                break;
            }

            switch (opcaoMenu1) {
                case 1:
                    votar(entrada, opcaoVoto);
                    continue;
                case 2:
                    relatorioVotos();
                    continue;
                default:
                    System.err.println("[ERRO]: Opção inválida! Tente novamente...");

            }

            System.out.println("Continuou...");
        }
    }
    public static void votar(Scanner entrada, int voto) {

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

            switch (opcaoMenu2) {
                case 0:
                    System.out.println("Voto NULO");
                    votosNulo++;
                    return;
                case 1:
                    System.out.println("Voto Ana");
                    votosChapa1++;
                    return;
                case 2:
                    System.out.println("Voto Pedro");
                    votosChapa2++;
                    return;
                case 3:
                    System.out.println("Voto Rita");
                    votosChapa3++;
                    return;
                case 4:
                    System.out.println("Voto Alfredo");
                    votosChapa4++;
                    return;
                case 5:
                    System.out.println("Voto Regina");
                    votosChapa5++;
                    return;
                case 6:
                    System.out.println("Voto Ricardo");
                    votosChapa6++;
                    return;
                case 10:
                    System.out.println("Voto BRANCO");
                    votosEmBranco++;
                    return;
                case 11:
                    System.out.println("Retornando ao menu principal");
                    return;
                default:
                    System.err.println("[ERRO] Opção de voto inválida! Tente novamente... ");
                    votosInvalidos++;
            }
        }
    }

    public static void relatorioVotos() {
        System.out.println("----------RESULTADO VOTAÇÃO----------");
        System.out.println("Total de votos [CHAPA 1 - Ana]: " + votosChapa1);
        System.out.println("Total de votos [CHAPA 2 - Pedro]: " + votosChapa2);
        System.out.println("Total de votos [CHAPA 3 - Rita]: " + votosChapa3);
        System.out.println("Total de votos [CHAPA 4 - Alfredo]: " + votosChapa4);
        System.out.println("Total de votos [CHAPA 5 - Regina]: " + votosChapa5);
        System.out.println("Total de votos [CHAPA 6 - Ricardo]: " + votosChapa6);
        System.out.println("Total de votos [EM BRANCO]: " + votosEmBranco);
        System.out.println("Total de votos [NULO]: " + votosNulo);
        System.out.println("Total de votos [INVÁLIDO]: " + votosInvalidos);
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcaoMenuPrincipal = 0;

        menu(entrada, opcaoMenuPrincipal);

    }


}