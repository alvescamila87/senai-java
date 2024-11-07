package org.example;

import java.util.Scanner;

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
        int opcaoMenu = 0;

        while (true) {
            System.out.println("""
                    --------------- MENU ---------------
                    [1] Cadastrar Cliente e Animal
                    [2] Agendamento de Banho ou Tosa
                    [3] Gerar Relatórios
                    [4] Encerrar o programa
                    ------------------------------------
                    """);
            System.out.print("Escolha uma opção: ");
            opcaoMenu = entrada.nextInt();
            entrada.nextLine();

            if (opcaoMenu == 4) {
                System.out.println("Saindo do programa...");
                break;
            }

            switch (opcaoMenu) {

                case 1:
                    cadastrarCliente(entrada);
                    break;
                case 2:
                    agendarServico(entrada);
                    break;
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
            System.out.print("Tipo de Serviço (Banho/Tosa): ");
            tipoServico[contadorAgendamento] = entrada.nextLine();
            System.out.print("Status do serviço (Agendado/Realizado): ");
            tipoStatusDoServico[contadorAgendamento] = entrada.nextLine();

            System.out.println("Serviço agendado com sucesso!");
        } else {
            System.out.println("Não há mais clientes sem agendamento!");
        }
    }

    //Função para gerar o relatório
    public static void gerarRelatorio() {

        System.out.println("---------------RELATORIO---------------");
        int totalAgendado = 0;
        int totalRealizado = 0;

        for(int i = 0; i < contadorAgendamento; i++) {
            System.out.println("Cliente: " + clientes[i] + "Animal: " + animais[i]);
            System.out.println("Tipo de Animalç: " + tipoAnimal[i]);
            System.out.println("Serviço: " + tipoServico[i] + "Status: " + tipoStatusDoServico[i]);

            if(tipoStatusDoServico[i].equals("Agendado")) {
                totalAgendado++;
            } else if (tipoStatusDoServico[i].equals("Realizado")) {
                totalRealizado++;
            }
        }

        System.out.println("\nTotal de serviços agendados: " + totalAgendado);
        System.out.println("Total de serviços realizados: " + totalRealizado);
    }


}