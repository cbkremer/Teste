/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * Desafio: Criar algoritmo que leia 10 numeros e identifique qual é o maior e
 * menor entre eles.
 * Ao final apresente a lista de valores e o maior e menor valor
 * @author 182110075
 */
public class Exec6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] nums = new int[10];
        int maior = -2147483648, menor = 2147483647;
        System.out.println("--- Informe dez números: ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("informe o "+(i+1)+"º número: ");
            nums[i] = leia.nextInt();
            if(nums[i] > maior)
                maior = nums[i];
            if(nums[i] < menor)
                menor = nums[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor "+(i+1)+" :"+nums[i]);
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
