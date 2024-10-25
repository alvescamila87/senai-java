package org.example;

import java.util.Scanner;

public class Main {

    static String clientes[] = new String[5];
    static String animais[] = new String[5];
    static String tipoAnimal[] = new String[5];
    static String tipoServico[] = {"Banho", "Tosa"};
    static String tipoStatusDoServico[] = {"Agendado", "Realizado"};


    public static void menu(Scanner entrada, int opcaoMenu) {


        while (true) {

            int opcaoMenu1 = -1;
            System.out.println("""
                                    
                    ------------------ MENU ------------------
                    [1] - Agendar Horario
                    [2] - Gerar Relatório
                    [3] - Sair do Programa
                    
                    """);

            System.out.print("");
            System.out.print("Informe a opção: ");
            opcaoMenu1 = entrada.nextInt();
            entrada.nextLine();

            if (opcaoMenu1 == 3) {
                System.out.println("FIM DO PROGRAMA!");
                break;
            }

            switch (opcaoMenu1) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("[ERRO] Informação inválida! Tente Novamente...");
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcaoMenuPrincipal = 0;

        menu(entrada, opcaoMenuPrincipal);
    }
}