/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * 2. Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que
 * exiba o somatório desses números na tela. Após exibir a soma, o programa deve
 * mostrar também os números que o usuário digitou, um por linha.
 *
 * @author 182110075
 */
public class Exec2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[5];
        int count = 0;
        int soma = 0;
        System.out.println("--- Entrar com 5 números inteiros: ---");
        do {
            System.out.println("Informe valor " + (count + 1) + ": ");
            valores[count] = leia.nextInt();
            soma += valores[count];
            count += 1;
        } while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }
    }
}
