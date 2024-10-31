package edu.senai.br.debug1;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Debug1 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números você quer somar?");
        int quantidade = scanner.nextInt();
        
        int soma = 0;
        
        for (int i = 0; i <= quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
     
}
