/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2206;

import java.util.Scanner;

/**
 *
 * @author 182110075
 */
public class Soma_5_nums {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        float[] nums = new float[5];
        int n = nums.length;
        float media = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o "+(i+1)+"° número: ");
            nums[i] = leia.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Número "+(i+1)+": "+nums[i]);
            media += nums[i];
        }
        System.out.println("Média: "+media/n);
    }
}
