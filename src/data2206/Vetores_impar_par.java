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
public class Vetores_impar_par {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        float[] impar = new float[10];
        int[] par = new int[10];
        
        int n = impar.length;
        int ni = 0, np =0;
        float num;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o "+(i+1)+"° número: ");
            num = leia.nextFloat();
            if(num%2 == 0){
                par[np] = (int)num;
                np++;
            }
            else{
                impar[ni] = num;
                ni++;
            }
        }
        System.out.println("Impar:");
        for (int i = 0; i < n; i++) {
            System.out.print("|"+impar[i]+"|");
        }
        System.out.println("");
        System.out.println("Par:");
        for (int i = 0; i < n; i++) {
            System.out.print("|"+par[i]+"|");
        }
    }
}
