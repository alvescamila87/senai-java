package org.example;

import java.util.Scanner;

/**
 * @Autor1: Camila
 * @Autor2: João
 */
public class Main {

    static String clientes[] = new String[5];
    static String animais[] = new String[5];
    static String tipoAnimal[] = new String[5];
    static String tipoServico[] = new String[5];
    static String tipoStatusDoServico[] = new String[5];

    static int contadorCliente = 0;
    static int contadorAgendamento = 0;



    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcaoMenuPrincipal = 0;

        menuPrincipal(entrada, opcaoMenuPrincipal);

    }

    // Função menu

    public static void menuPrincipal(Scanner entrada, int opcaoMenu) {
        int opcaoMenu1 = -1;
        int opcaoSubmenu = 0;

        while (true) {
            System.out.println();
            System.out.println("""
                    --------------- MENU ---------------
                    [1] Cadastrar Cliente e Animal
                    [2] Agendar serviço
                    [3] Gerar Relatório
                    [4] Sair do sistema
                    ------------------------------------
                    """);
            System.out.print("Escolha uma opção: ");
            opcaoMenu1 = entrada.nextInt();
            entrada.nextLine();

            if (opcaoMenu1 == 4) {
                System.out.println("FIM DO PROGRAMA...");
                break;
            }

            switch (opcaoMenu1) {

                case 1:
                    cadastrarCliente(entrada);
                    continue;
                case 2:
                    agendarServico(entrada);
                    continue;
                case 3:
                    gerarRelatorio();
                    break;
                default:
                    System.out.println("[ERRO] Opção inválida, tente novamente");
            }

        }
    }

    //Função para cadastrar cliente
    public static void cadastrarCliente(Scanner entrada) {

        if (contadorCliente < 5) {

            System.out.print("Nome do cliente: ");
            clientes[contadorCliente] = entrada.nextLine();
            System.out.print("Nome do animal: ");
            animais[contadorCliente] = entrada.nextLine();
            System.out.print("Tipo do animal: ");
            tipoAnimal[contadorCliente] = entrada.nextLine();
            contadorCliente++;

            System.out.println("\nCliente cadastrado com sucesso!");
        } else {
            System.out.println("\nLimite de cliente atingido!");
        }
    }

    public static void agendarServico(Scanner entrada) {

        if(contadorAgendamento < contadorCliente) {

            System.out.println("Agendamento para "
                    + clientes[contadorAgendamento]
                    + " e seu animal " + animais[contadorAgendamento]);
            System.out.print("Tipo de Serviço: Banho ou Tosa: ");
            tipoServico[contadorAgendamento] = entrada.nextLine();
            System.out.print("Status do serviço: Agendado ou Realizado: ");
            tipoStatusDoServico[contadorAgendamento] = entrada.nextLine();
            contadorAgendamento++;
            System.out.println();
            System.out.println("Serviço agendado com sucesso!");
        } else {
            System.out.println();
            System.out.println("Não é permitido agendar mais serviços. Total esgotado!");
        }
    }

    //Função para gerar o relatório
    public static void gerarRelatorio() {

        System.out.println("--------------- RELATÓRIO ---------------");
        int totalAgendado = 0;
        int totalRealizado = 0;

        for(int i = 0; i < contadorAgendamento; i++) {
            System.out.println("Cliente: " + clientes[i] + " Animal: " + animais[i]);
            System.out.println("Tipo de Animal: " + tipoAnimal[i]);
            System.out.println("Serviço: " + tipoServico[i] + " Status: " + tipoStatusDoServico[i]);
            System.out.println();

            if(tipoStatusDoServico[i].equalsIgnoreCase("Agendado")) {
                totalAgendado++;
            } else if (tipoStatusDoServico[i].equalsIgnoreCase("Realizado")) {
                totalRealizado++;
            }
        }

        System.out.println("\nTotal de serviços agendados: " + totalAgendado);
        System.out.println("Total de serviços realizados: " + totalRealizado);
    }


}