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
public class Entrada_10_nums_x5 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        float[] nums = new float[2];
        float[] nums2 = new float[2];
        int n = nums.length;
        int n2 = nums.length;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o "+(i+1)+"° número: ");
            nums[i] = leia.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            nums2[i] = nums[i]*5;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("nums: "+nums[i]+" nums2: "+nums2[i]);
        }
    }
}
