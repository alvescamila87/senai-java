package org.example;

import java.util.Scanner;

public class Main {


    static double votosChapa1 = 0;
    static double votosChapa2 = 0;
    static double votosChapa3 = 0;
    static double votosChapa4 = 0;
    static double votosChapa5 = 0;
    static double votosChapa6 = 0;
    static double votosEmBranco = 0;
    static double votosNulo = 0;
    static double votosInvalidos = 0;
    static double totalVotos = 0;


    public static void menu(Scanner entrada, int opcaoMenu) {
        int opcaoMenu1 = -1;
        int opcaoVoto = 0;

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
                    totalVotos++;
                    return;
                case 1:
                    System.out.println("Voto Ana");
                    votosChapa1++;
                    totalVotos++;
                    return;
                case 2:
                    System.out.println("Voto Pedro");
                    votosChapa2++;
                    totalVotos++;
                    return;
                case 3:
                    System.out.println("Voto Rita");
                    votosChapa3++;
                    totalVotos++;
                    return;
                case 4:
                    System.out.println("Voto Alfredo");
                    votosChapa4++;
                    totalVotos++;
                    return;
                case 5:
                    System.out.println("Voto Regina");
                    votosChapa5++;
                    totalVotos++;
                    return;
                case 6:
                    System.out.println("Voto Ricardo");
                    votosChapa6++;
                    totalVotos++;
                    return;
                case 10:
                    System.out.println("Voto BRANCO");
                    votosEmBranco++;
                    totalVotos++;
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
        System.out.println("Total de votos [GERAL]: " + totalVotos);
        System.out.println("");
        System.out.println("---------- TOTAL GERAL ----------");
        System.out.println("Total de eleitores: " + totalVotos);
        double totalVotosValidos = totalVotos - (votosEmBranco + votosNulo);
        System.out.printf("Total de votos válidos: %s \n", totalVotosValidos);
        System.out.println("\nTotal de votos nulos: " + votosNulo);
        System.out.println("Total de votos em branco: " + votosEmBranco);
        System.out.println("");
        System.out.println("---------- PERCENTUAIS ----------");
        double percentualValidos = (double) (totalVotosValidos / totalVotos) * 100;
        System.out.printf("Percentual de votos: válidos %s %%\n", percentualValidos);
        double percentualEmBranco = (double) (votosNulo / totalVotos) * 100;
        System.out.printf("Percentual de votos: brancos %s %%\n", percentualEmBranco);
        double percentualNulos = (double) (votosNulo / totalVotos) * 100;
        System.out.printf("Percentual de votos: nulos %s %%\n", percentualNulos);
        System.out.println("");

    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcaoMenuPrincipal = 0;

        menu(entrada, opcaoMenuPrincipal);

    }


}