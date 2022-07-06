/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * 5. Crie um programa que armazene 10 números digitados pelo usuário em dois
 * vetores: um somente para números pares, e outro somente para números ímpares.
 * Após, exiba os valores dos dois vetores na tela, em sequência. Obs.: As
 * posições que não receberem valores exibirão o número zero. Não se preocupe
 * com isso por enquanto.
 *
 * @author 182110075
 */
public class Exec5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] valores = new int[10][2];
        System.out.println("--- Entre com 10 números inteiros: ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "º número: ");
            int valor = leia.nextInt();
            if (valor % 2 == 0) {
                //par
                valores[i][0] = valor;
                valores[i][1] = 0;//impar
            } else {
                //impar
                valores[i][0] = 0;
                valores[i][1] = valor;//impar
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i][0] + " | " + valores[i][1]);
        }
    }
}
